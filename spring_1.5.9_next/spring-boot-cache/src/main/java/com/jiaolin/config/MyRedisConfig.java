package com.jiaolin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * @author johnny
 * @Classname MyRedisConfig
 * @Description
 * @Date 2022/5/26 15:14
 */
@Configuration
public class MyRedisConfig {
    // 来配置redis 的 可序列化 RedisSerializer

    @Bean
    public RedisTemplate<Object, Object> template(RedisConnectionFactory factory) {
        RedisTemplate<Object, Object> redisTemplate=new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        Jackson2JsonRedisSerializer<Object> jsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        redisTemplate.setDefaultSerializer(jsonRedisSerializer);
        return redisTemplate;

    }
}
