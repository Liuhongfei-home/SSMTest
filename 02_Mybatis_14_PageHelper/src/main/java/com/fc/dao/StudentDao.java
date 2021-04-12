package com.fc.dao;

import com.fc.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    //增
    int add(Student student);


    //删
    int deleteStudent(@Param("id") int id);

    //改
    int updateStudent( Student student);

    //查
    List<Student> selectAllStudent();

    Student findById(@Param("id") int id);

    //
    int updateByTrim(Student student);

    // 模糊查询
    List<Student> selectStudentByForward(@Param("name") String name, @Param("age") int age);

    // 根据条件查询学生
    List<Student> selectStudentByStudent(Student student);

    List<Student> findAll();


}
