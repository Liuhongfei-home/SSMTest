package com.fc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//controller 控制层用于和前端进行交互
public class UserServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从前端获取数据
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        //设置属性键值对，要返回给前端
        req.setAttribute("","");
        req.getSession().setAttribute("","");
        //转发
        req.getServletContext().setAttribute("","");

        //重定向
        resp.sendRedirect("index.jsp");
    }
}
