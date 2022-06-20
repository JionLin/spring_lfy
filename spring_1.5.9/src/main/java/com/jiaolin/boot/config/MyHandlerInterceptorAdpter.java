package com.jiaolin.boot.config;

import com.jiaolin.boot.interceptor.MyHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author johnny
 * @Classname MyHandlerInterceptorAdpter
 * @Description
 * @Date 2022/5/16 18:35
 */
@Configuration
public class MyHandlerInterceptorAdpter {


    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new MyHandlerInterceptor());
            }
        };
        return adapter;
    }
}
