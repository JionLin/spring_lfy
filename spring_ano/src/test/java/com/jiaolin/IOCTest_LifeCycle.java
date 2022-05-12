package com.jiaolin;

import com.jiaolin.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author johnny
 * @Classname IOCTest_LifeCycle
 * @Description
 * @Date 2022/5/12 10:49
 */
public class IOCTest_LifeCycle {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成");


//        applicationContext.close();

    }
}
