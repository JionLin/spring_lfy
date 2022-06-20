package com.jiaolin.controller;

import com.jiaolin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author johnny
 * @Classname HelloController
 * @Description
 * @Date 2022/5/26 16:00
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public String sayHello() {
        helloService.sayHello();
        return "hi";
    }

    @GetMapping("/abcdef")
    public String Hello() {
        return "hello";
    }
}
