package com.jiaolin.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author johnny
 * @Classname Cat
 * @Description bean初始化的第2种方式, 实现 InitializingBean,DisposableBean
 * @Date 2022/5/12 11:13
 */
@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat(){
        System.out.println("cat constructor...");
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet...");

    }

    /**
     * @Author
     * @Description  销毁方法
     * @Date 11:14 2022/5/12
     * @Param []
     * @return void
     **/
    public void destroy() throws Exception {
        System.out.println("cat destroy...");

    }
}
