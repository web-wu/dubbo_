package com.w2x.dubbo_demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.w2x.dubbo_demo.service.DubboService;

@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String getName(String name) {
        return name;
    }
}
