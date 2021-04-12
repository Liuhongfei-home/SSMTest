package com.fc.controller;


import com.fc.bean.ComplexType;
import com.fc.bean.Student;
import com.fc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
//声明一级路径
@RequestMapping("user")
public class UserController {

    @RequestMapping("testBaseAndString")
    public String testBaseAndString(String username,String password,int age,String gender, String info){

        System.out.println("从前端取到的参数："+"姓名"+username+""+password+""+age+""+gender+""+info);
        return "/index.jsp";
    }

    @RequestMapping("testObject")
    public String testObject(User user,String birthday){

        System.out.println(user);

        System.out.println("从前端获取到的日期格式参数："+birthday);

        String replace=birthday.replace("-","/");

        System.out.println("转换后的日期格式："+ replace);

        return "/index.jsp";
    }
    @RequestMapping("testNestObject")
    public String testNestObject(Student student) {
        System.out.println(student);

        return "/index.jsp";
    }

    @RequestMapping("testComplexType")
    public String testComplexType(ComplexType complexType) {
        System.out.println(complexType);

        return "/index.jsp";
    }

    @RequestMapping("testServletApi")
    public void testServletApi(HttpServletRequest request,
                               HttpServletResponse response,
                               HttpSession session){

        //通过请求对象获取前端页面中input标签中name属性对应的value
        String username=request.getParameter("username");
        String password=request.getParameter("username");
        Integer age=Integer.valueOf(request.getParameter("age"));
        String gender=request.getParameter("username");
        String info=request.getParameter("username");

        User user=new User(username,password,age,gender,info);

        System.out.println(user);

        //給域对象中添加属性键值对
        request.setAttribute("username",username);

        session.setAttribute("user",user);

        try {
            //转发
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

//        try {
//            response.sendRedirect("/index.jsp");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

}
