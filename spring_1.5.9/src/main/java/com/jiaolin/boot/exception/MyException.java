package com.jiaolin.boot.exception;

/**
 * @author johnny
 * @Classname MyException
 * @Description
 * @Date 2022/5/16 17:02
 */
public class MyException extends RuntimeException{
    public MyException(){
        super();
    }

    public MyException(String message){
        super(message);
    }



}
