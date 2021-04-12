package com.fc.controller;


import com.fc.bean.Student;
import com.fc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//通过Spring容器创建对象
@Controller
public class StudentController {
    //依赖注入
    @Autowired
    private StudentService studentService;

    public Student getStudent(){
        return studentService.getStudent();
    }
}
