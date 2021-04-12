package com.fc.dao.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;

public class UserDaoMySqlImpl implements UserDao {
    @Override
    public User getUser() {

        System.out.println("换了个数据库，现在是通过Mysql连接");
        return new User();
    }
}
