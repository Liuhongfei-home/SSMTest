package com.fc.controller;

import com.fc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("testEncodingFilter")
    public String testFilter(User user, HttpServletRequest request){

        System.out.println(user);

        String remoteHost = request.getRemoteHost();

        System.out.println(remoteHost);


        return "/index.jsp";
    }

}
