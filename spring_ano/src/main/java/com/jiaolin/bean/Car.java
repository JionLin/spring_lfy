package com.jiaolin.bean;

import org.springframework.stereotype.Component;

/**
 * @author johnny
 * @Classname Car
 * @Description
 * @Date 2022/5/12 10:51
 */
@Component
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car ... init...");
    }

    public void detory(){
        System.out.println("car ... detory...");
    }

}
