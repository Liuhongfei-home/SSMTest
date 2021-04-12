package com.fc.dao;

import com.fc.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    Student findById(@Param("id") int id);
    List<Student> findAll();
}
