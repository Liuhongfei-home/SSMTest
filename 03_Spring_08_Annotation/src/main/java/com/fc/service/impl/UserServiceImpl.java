package com.fc.service.impl;

import com.fc.bean.User;
import com.fc.dao.UserDao;
import com.fc.dao.impl.UserDaoImpl;
import com.fc.service.UserService;

public class UserServiceImpl implements UserService {

    //声明一个dao层接口实现类
    private UserDao userDao;

    @Override
    public User getUser() {
        //通过dao获取对象
        return userDao.getUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
