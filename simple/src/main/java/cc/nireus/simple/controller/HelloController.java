package cc.nireus.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // 处理 /hello 请求并返回 "HELLO"
    @GetMapping("/hello")
    public String hello() {
        return "HELLO";
    }
}