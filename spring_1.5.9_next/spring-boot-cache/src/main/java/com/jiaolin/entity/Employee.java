package com.jiaolin.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author johnny
 * @Classname Employee
 * @Description
 * @Date 2022/5/26 14:56
 */
@Data
public class Employee implements Serializable {
    private String id;

    private String name;

}
