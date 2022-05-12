package com.jiaolin;

import com.jiaolin.bean.Person;
import com.jiaolin.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author johnny
 * @Classname IOCTest_propertyValue
 * @Description
 * @Date 2022/5/12 14:39
 */
public class IOCTest_propertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test1() {
        print(applicationContext);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    public void print(AnnotationConfigApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}
