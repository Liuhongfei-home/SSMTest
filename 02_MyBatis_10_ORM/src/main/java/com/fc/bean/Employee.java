package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data注解 能自动帮我们生成Setters、Getters、toString
//
//
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private  Integer eId;
    private String eName;
    private Integer eAge;
    private String eInfo;
}
