package com.hua.cotroller;

import com.hua.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @GetMapping("hello")
    public String hello() {
        return "consumer调用-> " + demoService.hello();
    }
}
