package com.fc.test;

import com.fc.bean.Employee;
import org.junit.Test;

public class LombokTest {
    @Test
    public void test() {
        Employee employee = new Employee(1, "猪小明", 20, "");

        System.out.println(employee.getEId());
        employee.setEId(2);

        System.out.println(employee);
    }
}
