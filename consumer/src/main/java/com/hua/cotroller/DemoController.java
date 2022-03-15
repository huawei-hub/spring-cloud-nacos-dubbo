package com.hua.cotroller;

import com.hua.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @GetMapping("/con")
    public String con() {
        return "consumer调用con-> " + demoService.hello();
    }

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }
}
