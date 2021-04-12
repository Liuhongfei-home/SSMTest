package com.fc.controller;

import com.fc.bean.User;
import com.fc.service.UserService;

public class UserController {
    private UserService userService;


    public User getUser() {
        // 通过业务层对象调用方法
        return userService.getUser();
    }

    public void setUserService(UserService userService) {
            this.userService=userService;
    }


}
