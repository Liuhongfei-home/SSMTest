package com.fc.dao.impl;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {
    @Override
    public Student GetStudent() {
        System.out.println("获得学生");
        return new Student();
    }
}
