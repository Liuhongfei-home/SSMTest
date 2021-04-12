package com.fc.test;

import com.fc.bean.Employee;
import com.fc.dao.EmployeeDao;
import com.fc.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

public class EmployeeTest {


    @Test
    public void testFindById(){
        //使用工具类获取接口
        EmployeeDao mapper = MybatisUtils.getMapper(EmployeeDao.class);

        //执行sql语句
        Employee employee = mapper.findById(1);
        System.out.println(employee);
    }

    @Test
    public void testFindAll(){
        //使用工具类获取接口
        EmployeeDao mapper = MybatisUtils.getMapper(EmployeeDao.class);

        //执行sql语句
        List<Employee> list = mapper.findAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

}
