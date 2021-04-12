package com.fc.service.impl;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import com.fc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("studentDaoImpl")
//    @Resource(name = "studentDaoMysqlImpl")//相当于上面俩注解
    private StudentDao studentDao;



    @Override
    public Student getStudent() {
        return studentDao.getStudent();
    }


}
