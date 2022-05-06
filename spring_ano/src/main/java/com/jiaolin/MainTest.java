package com.jiaolin;

import com.jiaolin.bean.Person;
import com.jiaolin.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author johnny
 * @Classname MainTesst
 * @Description
 * @Date 2022/5/6 10:14
 */
public class MainTest {
    // 使用xml的形式进行获取里面的参数
    public static void main(String[] args) {
        //1。 使用xml的形式来获取
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) applicationContext.getBean("person2");
//        System.out.println(person);

        //2。使用注解的方式进行获取
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person);

        //3.获取方法名称,正常是方法名称, 如果在bean中有写,读取的bean里面的方法
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }

    }
}
