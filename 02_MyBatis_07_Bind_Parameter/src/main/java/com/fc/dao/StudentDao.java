package com.fc.dao;

import com.fc.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface StudentDao {

    //插入一条数据到数据库中
    int addStudent();

    //根据指定id查询对应的学生
    Student findStudentById(int id);


    //测试序号参数绑定 ：args
    Student findByIdAndName(int id, String name);

    //根据id和年龄查询对应的学生
    Student findByIdAndAge(int id, int age);

    //根据姓名和年龄查询对应的学生
    //测试注解参数绑定 @param("")
    Student findByNameAndAge(@Param("name") String name, @Param("age") int age);

    //使用Map进行参数绑定
    Student findByNameAndGender(Map<String,Object> map);

    Student findByStudent(Student student);


}
