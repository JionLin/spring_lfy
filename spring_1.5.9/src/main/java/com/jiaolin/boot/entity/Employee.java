package com.jiaolin.boot.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Department department;
    private Date birth;


}
