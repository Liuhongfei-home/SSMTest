package com.fc.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
    //程序的入口
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");

            //准备相关的参数： url,username,password,

            String url="jdbc:mysql://localhost:3306/dev01?useSSL=false";
            String username="root";
            String password="root";

            //获取连接
            Connection connection = DriverManager.getConnection(url, username, password);

            //快捷键：sout
            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test() {
        try {
            // 加载驱动  Alt + Enter
            Class.forName("com.mysql.jdbc.Driver");

            // 准备相关的参数：url，username,password,
            String url = "jdbc:mysql://localhost:3306/dev01?useSSL=false";
            String username = "root";
            String password = "root";


            // 获取连接
            Connection connection = DriverManager.getConnection(url, username, password);

            // 快捷键：sout
            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
