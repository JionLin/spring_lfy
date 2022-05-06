package com.jiaolin.config;

import com.jiaolin.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author johnny
 * @Classname MainConfig
 * @Description
 * @Date 2022/5/6 10:10
 */
@Configuration
public class MainConfig {

    @Bean("person")
    public Person person2(){
        return new Person("zs",22);
    }
}
