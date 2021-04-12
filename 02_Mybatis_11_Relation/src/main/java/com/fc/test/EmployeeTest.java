package com.fc.test;

import com.fc.bean.Employee;
import com.fc.dao.EmployeeDao;
import com.fc.utils.MyBatisUtils;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testFindById() {
        // 通过工具类获取接口的实现类
        EmployeeDao mapper = MyBatisUtils.getMapper(EmployeeDao.class);

        // 执行sql语句
        Employee employee = mapper.findById(1);

        System.out.println(employee);
    }
}
