package com.fc.dao.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public User getUser() {

        System.out.println("辛辛苦苦，又换了个Oracle数据库");
        return new User();
    }
}
