package com.fc.test;

import com.fc.bean.Student;
import com.fc.bean.User;
import com.fc.controller.UserController;
import com.fc.dao.impl.UserDaoImpl;
import com.fc.service.UserService;
import com.fc.service.impl.UserServiceImpl;
import org.junit.Test;


public class UserTest {

    @Test
    public void test(){
        //获取控制层对象,用来进行前后端交互
        UserController userController = new UserController();

        //创建一个dao层对象，用来给业务层进行注入
        UserServiceImpl userService = new UserServiceImpl();

        //创建一个业务层对象，用来给控制层注入
        UserDaoImpl userDao = new UserDaoImpl();

        //给业务层进行依赖注入
        userService.setUserDao(userDao);

        //给业务层进行依赖注入
        userController.setUserService(userService);

        //获取对象
        User user = userController.getUser();

        System.out.println(user);
    }



}
