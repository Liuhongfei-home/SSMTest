package com.fc.test;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import com.fc.utils.MyBatisUtils;

import org.apache.ibatis.io.Resources;
import org.junit.Test;

import java.util.List;

public class MybatisUtilsTest {
    @Test
    public void utilsTest(){

        try {
            //通过工具类获取接口的实现类对象
            StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

            //调用方法
            List<Student> list=mapper.findAll();

            //增强for循环
            for (Student student : list) {
                System.out.println(student);
            }

            //提交
            MyBatisUtils.commit();
        }catch (Exception e){
            e.printStackTrace();
            //回滚
            MyBatisUtils.rollBack();

        }




    }
}
