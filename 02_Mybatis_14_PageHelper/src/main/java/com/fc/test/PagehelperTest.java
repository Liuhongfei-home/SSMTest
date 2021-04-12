package com.fc.test;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import com.fc.utils.MybatisUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import java.util.List;

public class PagehelperTest {
    @Test
    public void test(){
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        //必须指定两个参数，必须在sql语句执行前
        //pageNum 当前页
        //pageSize 当前页数据条数
        PageHelper.startPage(2,5);

        List<Student> list = mapper.selectAllStudent();

        PageInfo<Student> pageInfo = new PageInfo<>(list);
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("获取当前页"+pageInfo.getPageNum());
        System.out.println("获取每页显示的条数"+pageInfo.getPageSize());
        System.out.println("获取总页数"+pageInfo.getPages());

    }
}
