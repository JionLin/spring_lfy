package com.jiaolin.config;

import com.jiaolin.bean.Color;
import com.jiaolin.bean.Person;
import com.jiaolin.bean.Red;
import com.jiaolin.condition.LinuxCondition;
import com.jiaolin.condition.MyImportBeanDefinitionRegistrar;
import com.jiaolin.condition.MyImportSelector;
import com.jiaolin.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author johnny
 * @Classname MainConfig
 * @Description
 * @Date 2022/5/6 10:10
 */
@Configuration
@Import({Red.class, Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    /**
     * @return com.jiaolin.bean.Person
     * @Author johnny
     * @Description 作用域:
     * * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * 多实例 prototype ioc容器启动的时候,并不会去调用方法创建对象,每次获取的时候才会调用方法创建对象
     * * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * 单实例 singleton 默认为单实例 ioc容器启动的时候 会调用方法创建对象到ioc容器中,以后每次获取就是从容器中拿
     * * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * 请求 request 同一个请求创建一个实例
     * * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     * session 同一个session 创建一个实例
     * <p>
     * lazy:ioc容器启动不会创建对象,在第一次使用的时候,才会去创建对象
     * 单实例:ioc容器启动的时候创建对象,
     * @Date 14:20 2022/5/6
     * @Param []
     **/
//    @Scope
//    @Scope(value ="prototype" )
//    @Conditional()
//    @Lazy
    @Bean("person")
    public Person person2() {
        System.out.println("给容器中添加Person");
        return new Person("ls", 22);
    }


    @Conditional({WindowsCondition.class})
    @Bean("win")
    public Person person3() {
        return new Person("win", 48);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public Person person4() {
        return new Person("linux", 50);
    }



}
