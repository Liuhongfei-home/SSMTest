package com.fc.dao;

import com.fc.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    Student findById(@Param("id") Integer id);

    // 插入一个学生
    int add(Student student);

    // 根据指定的条件查询模糊对应的学生
    List<Student> findByKeyword(Student student);

    // 修改学生
    int update(Student student);

    Student findByStudent(Student student);

    int updateByTrim(Student student);

    // 根据指定的id查询对应的学生
    // ... ：可变长参数（不定长参数）jdk1.5 的新特性，相当于数组
    // k可变长参数的长度可变，可以是0个，1个，多个
    // 可变长参数在形参中只能有一个，并且只能是最后一个
    List<Student> findByIds(Integer... ids);
}
