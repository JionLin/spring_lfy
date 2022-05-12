package com.jiaolin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author johnny
 * @Classname Person
 * @Description
 * @Date 2022/5/6 10:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Value("zs")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
