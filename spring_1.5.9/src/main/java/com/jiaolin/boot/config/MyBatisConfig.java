package com.jiaolin.boot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author johnny
 * @Classname MyBatisConfig
 * @Description
 * @Date 2022/5/18 14:43
 */
@Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        // 进行lambda表达式的设置
        return (configuration -> {
            configuration.setMapUnderscoreToCamelCase(true);
        });
    }
}
