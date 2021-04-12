package com.fc.testScope;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RuntimeTest {
    @Test
    public void testRuntime(){
        try {
            //1、加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //准备参数
            //URL组成：协议、主机、端口、项目名/路径、
            String url="jdbc:mysql://localhost:3306/dev01?useSSL=false";
            String user="root";
            String password="root";
            //获取连接
            Connection conn=DriverManager.getConnection(url,user,password);
            System.out.println(conn);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testRuntime2(){
        try {
            //1、加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //准备参数
            //URL组成：协议、主机、端口、项目名/路径、
            String url="jdbc:mysql://localhost:3306/dev01?useSSL=false";
            String user="root";
            String password="root";
            //获取连接
            Connection conn=DriverManager.getConnection(url,user,password);
            System.out.println(conn);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
