package com.hua.service;

import com.hua.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService//(protocol = "rest")
public class DemoServiceImpl implements DemoService {

    @Value("${server.port}")
    private String port;

    @Override
    public String hello() {
        return "produce被调用成功 ->" + port;
    }
}
