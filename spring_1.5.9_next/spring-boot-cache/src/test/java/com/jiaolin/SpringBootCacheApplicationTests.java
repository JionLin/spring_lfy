package com.jiaolin;

import com.jiaolin.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootCacheApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    RedisTemplate<Object, Object> template;

    //    org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration
    @Test
    public void test1() {
        stringRedisTemplate.opsForValue().set("k1", "v1");
        String value = stringRedisTemplate.opsForValue().get("k1");
        System.out.println(value);
    }

    @Test
    public void  test2(){
        Employee employee=new Employee();
        employee.setName("小强");
        employee.setId("11");
        template.opsForValue().set("emp-3",employee);
    }


}
