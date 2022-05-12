package com.jiaolin.config;

import com.jiaolin.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author johnny
 * @Classname MainConfigOfPropertyValues
 * @Description
 * @Date 2022/5/12 14:32
 */
@Configuration
// 需要从配置文件引入数据
@PropertySource(value = {"classpath:/person.properties"})
public class MainConfigOfPropertyValues {

    @Bean
    public Person person() {
        return new Person();
    }
}
