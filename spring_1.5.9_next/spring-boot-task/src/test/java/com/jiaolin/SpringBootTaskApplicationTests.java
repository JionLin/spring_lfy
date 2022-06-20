package com.jiaolin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

// qwejiao1314@163.com
@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootTaskApplicationTests {


    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void test1(){
        SimpleMailMessage message = new SimpleMailMessage();

        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");

        message.setTo("250912986@qq.com");
        message.setFrom("250912986@qq.com");

        mailSender.send(message);
    }


}
