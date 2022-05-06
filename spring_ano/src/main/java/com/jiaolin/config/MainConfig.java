package com.jiaolin.config;

import com.jiaolin.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author johnny
 * @Classname MainConfig
 * @Description
 * @Date 2022/5/6 10:10
 */
@Configuration
// 类型为注解的,只包含controller层
@ComponentScan(value = "com.jiaolin",
//        includeFilters = {
//     @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//},
        excludeFilters = {
                @Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
        })
public class MainConfig {

    @Bean("person")
    public Person person2() {
        return new Person("zs", 22);
    }
}
