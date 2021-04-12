package com.fc.test;

import com.fc.bean.Department;
import com.fc.dao.DepartmentDao;
import com.fc.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

public class DepartmentTest {

    @Test
    public void test(){

        DepartmentDao mapper = MyBatisUtils.getMapper(DepartmentDao.class);

        List<Department> list = mapper.findById(1);

        for (Department department : list) {
            System.out.println(department);
        }


    }
}
