package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("add")
    public String add(){

        System.out.println("add已执行");

        return "index.jsp";
    }

}
