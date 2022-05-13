package com.jiaolin.config;

/**
 * @author johnny
 * @Classname MainConifgOfAutowired
 * @Description 自动装配;
 *  * 		Spring利用依赖注入（DI），完成对IOC容器中中各个组件的依赖关系赋值；
 * 1.autowired自动注入的方式的第1种,默认按照类型去找
 * 2.resource和inject 进行注入
 *
 * @Date 2022/5/13 10:45
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.jiaolin.controller","com.jiaolin.service","com.jiaolin.dao"})
public class MainConfigOfAutowired {


//    @Bean
//    public HelloDao helloDao(){
//        HelloDao helloDao = new HelloDao();
//        helloDao.setLable("2");
//        return helloDao;
//    }

}
