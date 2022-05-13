package com.jiaolin;

import com.jiaolin.config.MainConfigOfAutowired;
import com.jiaolin.dao.HelloDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author johnny
 * @Classname IOCTest_autowired
 * @Description
 * @Date 2022/5/13 11:36
 */
public class IOCTest_autowired {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
    public void print(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void test1() {
        HelloDao helloDao = applicationContext.getBean(HelloDao.class);
        System.out.println(helloDao);
//        HelloService helloService = applicationContext.getBean(HelloService.class);
//        System.out.println(helloService);

    }
}
