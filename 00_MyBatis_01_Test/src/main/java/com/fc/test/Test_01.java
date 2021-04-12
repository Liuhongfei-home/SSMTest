package com.fc.test;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import com.fc.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class Test_01 {

    //查询所有
    @Test
    public void selectAllTest(){
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        List<Student> list = mapper.selectAllStudent();

        for (Student student : list) {
            System.out.println(student);
        }
    }



    //增
    @Test
    public void addTest(){
        //调用工具类
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        //创建学生对象
        Student student = new Student();
        student.setName("P40");
        student.setAge(1);
        student.setGender("X");
        student.setInfo("aaaa");

        //执行SQL语句
        int affectedRows = mapper.add(student);

        //事务提交
        MybatisUtils.commit();

        System.out.println(affectedRows);

    }

    //删
    @Test
    public void deleteStudent(){
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        int affectedRows= mapper.deleteStudent(17);
        MybatisUtils.commit();
        System.out.println("受影响的行数"+affectedRows);

    }


    //改
    @Test
    public void updateTest(){
        //调用工具类
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        //创建学生对象
        Student student = new Student();
        student.setId(1);
        student.setName("易烊千玺");
        student.setInfo("四个字不一定是成语，还有可能是易烊千玺");

        //执行SQL语句
        int affectedRows = mapper.updateStudent(student);

        //事务提交
        MybatisUtils.commit();

        System.out.println(affectedRows);

    }

    //查询
    @Test
    public void findById(){
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        Student student = mapper.findById(1);

        System.out.println(student);

    }

    //trim 修改
    @Test
    public void testTrim(){
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(6);
        student.setName("黑小胡");
        student.setGender("男");
        student.setInfo("我做事 光明磊落");


        int affectedRows = mapper.updateByTrim(student);
        MybatisUtils.commit();
        System.out.println(affectedRows);
    }

    //模糊查询
    @Test
    public void selectStudentByForwardTest(){
        StudentDao mapper = MybatisUtils.getMapper(StudentDao.class);

        List<Student> list = mapper.selectStudentByForward("%"+"他"+"%", 20);

        for (Student student : list) {
            System.out.println(student);
        }


    }

}
