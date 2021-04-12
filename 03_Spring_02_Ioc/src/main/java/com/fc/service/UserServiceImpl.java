package com.fc.service;

import com.fc.bean.User;
import com.fc.dao.UserDao;
import com.fc.dao.impl.UserDaoMySqlImpl;

//业务层不能访问数据库
public class UserServiceImpl implements  UserService   {
        private UserDao userDao=new UserDaoMySqlImpl();

        @Override
        public User getUser() {
                return userDao.getUser();
        }
}
