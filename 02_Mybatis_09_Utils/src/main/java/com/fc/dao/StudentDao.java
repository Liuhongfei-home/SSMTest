package com.fc.dao;


import com.fc.bean.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAll();

    int addStudent(Student student);

}
