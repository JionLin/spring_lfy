package com.jiaolin.boot.config;

import com.jiaolin.boot.filter.MyFilter;
import com.jiaolin.boot.listern.MyListen;
import com.jiaolin.boot.servlet.MyServlet;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author johnny
 * @Classname MyConfig
 * @Description
 * @Date 2022/5/17 13:51
 */
@Configuration
public class MyConfig {


    /**
     * @return org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer
     * @Author johnny
     * @Description 配置自定义的嵌入式的servlet
     * @Date 13:51 2022/5/17
     * @Param []
     **/
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        // copy 左括号 写写中括号 落地右括号
        return (container -> container.setPort(8084));
    }

    /**
     * @return org.springframework.boot.web.servlet.ServletRegistrationBean
     * @Author johnny
     * @Description 进行注册servlet ,后续会注册 filter 和listen
     * @Date 14:08 2022/5/17
     * @Param []
     **/
    @Bean
    public ServletRegistrationBean myServ() {
        ServletRegistrationBean registrationBean =
                new ServletRegistrationBean(new MyServlet(), "/myServlet");
        return registrationBean;
    }

    /**
     * @Author johnny
     * @Description  注册filter
     * @Date 14:53 2022/5/17
     * @Param []
     * @return org.springframework.boot.web.servlet.FilterRegistrationBean
     **/
    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet", "/hello"));
        return filterRegistrationBean;
    }

    /**
     * @Author johnny
     * @Description 注册listener
     * @Date 14:53 2022/5/17
     * @Param []
     * @return org.springframework.boot.web.servlet.ServletListenerRegistrationBean
     **/
    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean();
        registrationBean.setListener(new MyListen());
        return registrationBean;
    }
}
