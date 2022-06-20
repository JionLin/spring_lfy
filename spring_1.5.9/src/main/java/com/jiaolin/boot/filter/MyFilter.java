package com.jiaolin.boot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author johnny
 * @Classname MyFilter
 * @Description
 * @Date 2022/5/17 14:21
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter doFilter..... ");
    }

    @Override
    public void destroy() {

    }
}
