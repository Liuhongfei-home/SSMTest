package com.fc.test;

import com.fc.bean.Employee;
import com.fc.dao.EmployeeDao;
import com.fc.utils.MybatisUtils;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testFindById(){
        EmployeeDao mapper = MybatisUtils.getMapper(EmployeeDao.class);
        mapper.findByid(3);

    }
}
