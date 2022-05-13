package com.jiaolin.config;

/**
 * @author johnny
 * @Classname MainConifgOfAutowired
 * @Description 自动装配;
 *  * 		Spring利用依赖注入（DI），完成对IOC容器中中各个组件的依赖关系赋值；
 * 1.autowired自动注入的方式的第1种,默认按照类型去找
 * 2.resource和inject 进行注入
 * 3.@Autowired可以放在构造器,参数,方法,属性
 *  1。放在方法上 set方法上 如果是@Bean中,那么参数中只有一个,那么自动从容器中获取,可以省略@autowired
 *  2。放在构造器上  @Autowired 如果只有一个参数,默认从容器中加载
 *     public Boss(Fruit fruit)
 *  3. 放在参数上 public Boss(@Autowired Fruit fruit)
 *  4.实现接口,xxxAware ApplicationContextAware
 *
 *
 * @Date 2022/5/13 10:45
 */

import com.jiaolin.bean.autowired.Fruit;
import com.jiaolin.bean.autowired.Wifi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.jiaolin.controller","com.jiaolin.service",
        "com.jiaolin.dao","com.jiaolin.bean.autowired"})
public class MainConfigOfAutowired {


//    @Bean
//    public HelloDao helloDao(){
//        HelloDao helloDao = new HelloDao();
//        helloDao.setLable("2");
//        return helloDao;
//    }

    @Bean
    public Wifi wifi(Fruit fruit){
        Wifi wifi = new Wifi();
        wifi.setFruit(fruit);
        return wifi;
    }

}
