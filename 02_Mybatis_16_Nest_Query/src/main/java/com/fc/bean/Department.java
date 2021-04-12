package com.fc.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int dId;
    private String dName;

    //一个部门对应多个员工
    private List<Employee> employees;
}
