package com.jiaolin.service.impl;

import com.jiaolin.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Service;

/**
 * @author johnny
 * @Classname HelloServiceImpl
 * @Description
 * @Date 2022/5/26 16:01
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Async
    @Override
    public void sayHello() {
        try {
            Thread.sleep(4000);
            log.info("hi~");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
      , 枚举值 进行运行
     - 区间内进行执行
     * 任意
     / 步长 每* 时间段
     // @Scheduled(cron = "0 * * * * MON-SAT")
     //@Scheduled(cron = "0,1,2,3,4 * * * * MON-SAT") // 当为 0,1,2,3,4秒当时候,进行执行
     // @Scheduled(cron = "0-4 * * * * MON-SAT") 在0-4 这个区间内进行执行
     @Scheduled(cron = "0/4 * * * * MON-SAT")  //每4秒执行一次
     */
//    @Scheduled(cron = "5-10 * * * * MON-SAT")
    @Override
    public void sendMsg(){
        log.info("你好呀啊啊啊");
    }
}
