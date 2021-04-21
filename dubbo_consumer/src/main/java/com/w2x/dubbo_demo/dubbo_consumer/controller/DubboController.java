package com.w2x.dubbo_demo.dubbo_consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.w2x.dubbo_demo.dubbo_consumer.service.DubboService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DubboController {
    @Reference
    private DubboService dubboService;

    public ModelAndView getName(ModelAndView modelAndView, String name) {
        String name1 = dubboService.getName(name);
        modelAndView.addObject("name", name1);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}
