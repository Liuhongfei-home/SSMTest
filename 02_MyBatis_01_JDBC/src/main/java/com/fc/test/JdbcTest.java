package com.fc.test;


import com.fc.bean.Student;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest {
    @Test
    public void testAdd() {

        //1、加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2、准备参数
            String url = "jdbc:mysql://localhost:3306/dev01?serverTimezone=UTC&useSSL=false";
            String user = "root";
            String password = "root";
            //3、获取连接
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);
            //准备sql语句
            String sql = "insert into student(name,age) values(?,?) ";

            //sql注入
            //4、获取预处理搬运对象，用来将SQL语句搬到数据库中
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //5、设置参数
            preparedStatement.setString(1, "忆忘情伤");
            preparedStatement.setString(2, "29");

            //6、执行sql语句，并获取受影响的行数
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println("受影响的行数：" + affectedRows);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void  testQuery(){

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //准备参数
            String url = "jdbc:mysql://localhost:3306/dev01?serverTimezone=UTC&useSSL=false";
            String user = "root";
            String password = "root";

            //获取连接
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println(connection);

            //准备sql语句
            String sql = "select *from student";

            //sql注入
            //获取预处理搬运对象，用来将SQL语句搬到数据库中
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet=preparedStatement.executeQuery();

            //准备一个集合，用来存储学生对象
            List<Student> list=new ArrayList<Student>();
            //遍历结果集对象（迭代）
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                Date birthday = resultSet.getDate("birthday");
                String info = resultSet.getString("info");
                // 将得到的结果封装到对象中
                Student student = new Student(id, name, age, gender, birthday, info);

                // 将对象放到集合中
                list.add(student);
            }
            // 遍历list
            for (Student student : list) {
                System.out.println(student.toString());
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }



    }




}
