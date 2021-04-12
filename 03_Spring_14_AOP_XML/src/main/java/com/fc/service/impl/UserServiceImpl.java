package com.fc.service.impl;

import com.fc.service.UserService;

// 业务层接口的实现类
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("1班的靓仔们，好久不见，甚是想念");
    }

    @Override
    public void update() {
        System.out.println("1班的靓仔们刚刚又老了两天");
    }
}
