package com.fc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("servlet已执行");

//        //设置编码集
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
//
//        //接收请求
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+"  "+password);
//
//        //连接数据库
//
//        //发送响应
        resp.getWriter().append("<h1 align='center' style='color:yellowgreen'>核桃</h1>");
//
//        //在域对象中添加属性键值对
//        //域对象：session、request、pageContext、applicationContext-->ServletContext
        req.setAttribute("username",username);

        req.setAttribute("password",password);

//        req.getSession().getServletContext().setAttribute("username",username);

//        //跳转页面
//        //转发
        req.getRequestDispatcher("/success.jsp").forward(req,resp);
//
//        //重定向
//        resp.sendRedirect("/success.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      doGet(req,resp);

    }
}
