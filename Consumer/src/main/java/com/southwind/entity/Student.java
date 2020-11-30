package com.southwind.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
* 实体类
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;
    private String username;
    private String password;
}