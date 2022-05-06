package com.jiaolin;

import com.jiaolin.config.MainConfig;
import com.jiaolin.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author johnny
 * @Classname Test
 * @Description
 * @Date 2022/5/6 11:13
 */
public class IocTest {


    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("ioc容器创建完成....");
        Object person = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
//        System.out.println(person == person2);
    }
}
