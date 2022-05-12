package com.jiaolin.config;

import com.jiaolin.bean.lifecycle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author johnny
 * @Classname MainConfigOfLifeCycle
 * @Description  bean 生命周期
 * @Date 2022/5/12 10:44
 */
@Configuration
@ComponentScan(value = "com.jiaolin.bean.lifecycle")
public class MainConfigOfLifeCycle {

//    @Scope("prototype")
    @Bean(initMethod ="init",destroyMethod = "detory")
    public Car car(){
        return new Car();
    }
}
