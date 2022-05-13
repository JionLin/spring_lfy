package com.jiaolin.service;

import com.jiaolin.dao.HelloDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author johnny
 * @Classname HelloService
 * @Description
 * @Date 2022/5/6 10:10
 */
@Service
public class HelloService {

//    @Qualifier("helloDao")
//    @Autowired
//    @Resource
    @Inject
    private HelloDao helloDao;

    public void print(){
        System.out.println(helloDao);
    }


    @Override
    public String toString() {
        return "HelloService{" +
                "helloDao=" + helloDao +
                '}';
    }
}
