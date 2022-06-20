package com.jiaolin.boot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author johnny
 * @Classname MyCommandLineRunner
 * @Description
 * @Date 2022/5/18 18:01
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner.....run...");
    }
}
