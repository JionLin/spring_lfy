package com.jiaolin.boot.handler;

import com.jiaolin.boot.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author johnny
 * @Classname ExceptionHandler
 * @Description
 * @Date 2022/5/16 17:03
 */
@ControllerAdvice
public class ExceptionHandler {


    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(MyException.class)
    public void getExceptionInfo(HttpServletResponse response,MyException exception) throws IOException {
        // 使用response写出去
        response.setContentType("application/json; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        String message = exception.getMessage();
        response.getWriter().write(message);
        response.getWriter().flush();
        response.getWriter().close();

    }



}
