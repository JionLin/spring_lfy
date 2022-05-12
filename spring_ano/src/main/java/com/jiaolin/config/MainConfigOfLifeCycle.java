package com.jiaolin.config;

import com.jiaolin.bean.lifecycle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author johnny
 * @Classname MainConfigOfLifeCycle
 * @Description  bean 生命周期 创建 初始化 销毁
 * 1. bean注解上面添加的方式进行
 * 2. 实现接口 InitializingBean DisposableBean ,重写里面的方法。
 * 3, 使用jsr250的@postConstruct 在bean创建完成,来初始化该方法。
 * @destroy 在容器销毁bean之前,来执行destory方法
 * @Date 2022/5/12 10:44
 */
@Configuration
@ComponentScan(value = "com.jiaolin.bean.lifecycle")
public class MainConfigOfLifeCycle {

//    @Scope("prototype")
    @Bean(initMethod ="init",destroyMethod = "detory")
    public Car car(){
        return new Car();
    }
}
