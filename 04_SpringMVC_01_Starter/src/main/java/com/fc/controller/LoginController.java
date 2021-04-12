package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//将当前类教给Spring容器进行管理
@Controller
public class LoginController {

    //RequestMapping这个注解用来声明访问的url，也就是访问的路径
    //相当于配置了servlet mapping中的url-pattern
    @RequestMapping("login")
    public String login() {
        System.out.println("登录了。。。。");

        return "/index.jsp";
    }

    @RequestMapping("register")
    public String register() {
        System.out.println("注册了。。。。");

        return "/index.jsp";
    }

}