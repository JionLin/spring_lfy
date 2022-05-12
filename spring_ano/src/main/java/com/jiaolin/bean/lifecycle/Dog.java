package com.jiaolin.bean.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author johnny
 * @Classname Dog
 * @Description
 * @Date 2022/5/12 11:25
 */
@Component
public class Dog {
    public Dog(){
        System.out.println("dog constructor...");
    }

    @PostConstruct
    public void  init(){
        System.out.println("dog init...");

    }

    @PreDestroy
    public void destroy(){
        System.out.println("dog destroy...");

    }
}
