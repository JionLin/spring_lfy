package com.jiaolin;

import com.jiaolin.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author johnny
 * @Classname MainTesst
 * @Description
 * @Date 2022/5/6 10:14
 */
public class MainTesst {
    // 使用xml的形式进行获取里面的参数
    public static void main(String[] args) {
        // 使用xml的形式来获取
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person2");
        System.out.println(person);
    }
}
