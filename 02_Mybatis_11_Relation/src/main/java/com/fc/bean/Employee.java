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
    private  int eId;
    private String eName;
    private Integer eAge;
    private String eInfo;

    //一个员工对应一个部门
    private Department department;
}
