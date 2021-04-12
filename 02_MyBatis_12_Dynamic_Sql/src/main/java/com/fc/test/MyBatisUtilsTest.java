package com.fc.test;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;


import com.fc.utils.MyBatisUtils;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MyBatisUtilsTest {
    @Test
    public void testFindById() {
        // 通过工具类获取接口的实现类对象
        StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

        Student student = mapper.findById(1);

        System.out.println(student);
    }

    @Test
    public void testAdd() {
        StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("邢克垒");
        student.setAge(28);
        student.setGender("男");
        student.setBirthday(new Date());
        student.setInfo("三月份上半月份的男友");

        int affectedRows = mapper.add(student);

        MyBatisUtils.commit();

        System.out.println(affectedRows);
    }

    @Test
    public void testFindByKeyword() {
        StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

        Student student = new Student();

        student.setName("%" + "巴" + "%");
        student.setAge(18);

        List<Student> list = mapper.findByKeyword(student);

        for (Student result : list) {
            System.out.println(result);
        }
    }

    @Test
    public void testUpdate() {
        StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(11);
        student.setName("汤不里不");
        student.setAge(4);
        student.setBirthday(new Date());
        student.setGender("X");
        student.setInfo("是个宝宝");

        int affectedRows = mapper.update(student);

        MyBatisUtils.commit();

        System.out.println(affectedRows);
    }

    @Test
    public void testFindByStudent() {
        StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(11);
        student.setName("汤不里不");

        Student result = mapper.findByStudent(student);

        System.out.println(result);
    }

    @Test
    public void testUpdateByTrim() {
        StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(13);
        student.setName("黑小虎");
        student.setGender("男");
        student.setInfo("我做事光明磊落");

        int affectedRows = mapper.updateByTrim(student);

        System.out.println(affectedRows);

        MyBatisUtils.commit();
    }

    @Test
    public void testFindByIds() {
        StudentDao mapper = MyBatisUtils.getMapper(StudentDao.class);

        List<Student> list = mapper.findByIds(1, 2);

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
