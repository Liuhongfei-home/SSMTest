package com.fc.service.impl;

import com.fc.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {

        System.out.println("希望1班的靓仔们都带着对象来听课");
    }

    @Override
    public void update() {
        System.out.println("今天1班的靓仔们又老了一个小时...");
    }
}
