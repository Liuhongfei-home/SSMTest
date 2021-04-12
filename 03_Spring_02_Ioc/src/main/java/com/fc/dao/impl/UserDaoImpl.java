package com.fc.dao.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;

//dao就是连接数据库的
public class UserDaoImpl implements UserDao {
    @Override
    public User getUser() {
//        Class.forName();
//        Connection connection = DriverManager.getConnection("", "", "");
//        PreparedStatement preparedStatement = connection.prepareStatement("sql");
//
//        //执行增删改
//        int affected=preparedStatement.executeUpdate();
//
//        //执行查询
//        ResultSet resultSet=preparedStatement.executeQuery();
//        while (resultSet.next()){
//            //手动映射
//            int id=resultSet.getInt("id");
//            String name = resultSet.getString("name");
//        }
        System.out.println("dao连接数据库");

        return new User();
    }
}
