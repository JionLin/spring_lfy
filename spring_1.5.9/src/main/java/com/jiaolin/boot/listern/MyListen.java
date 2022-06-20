package com.jiaolin.boot.listern;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author johnny
 * @Classname MyListen
 * @Description
 * @Date 2022/5/17 14:22
 */
public class MyListen implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
//        System.out.println("servletContextEvent init....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
//        System.out.println("servletContextEvent destroy");
    }
}
