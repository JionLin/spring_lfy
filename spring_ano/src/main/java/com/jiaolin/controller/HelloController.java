package com.jiaolin.controller;

import com.jiaolin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author johnny
 * @Classname HelloController
 * @Description
 * @Date 2022/5/6 10:10
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
}
