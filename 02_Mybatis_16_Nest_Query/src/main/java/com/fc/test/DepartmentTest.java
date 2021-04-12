package com.fc.test;

import com.fc.bean.Department;
import com.fc.dao.DepartmentDao;
import com.fc.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

public class DepartmentTest {

    @Test
    public void test(){
        DepartmentDao mapper = MybatisUtils.getMapper(DepartmentDao.class);

        Department department = mapper.findByDepartmentId(3);

        System.out.println(department);


    }
}
