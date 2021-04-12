package com.fc.test;

import com.fc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTypeTest {
    @Test
    public void test() {
        // 声明一个Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取业务层实现类对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
        userService.update();
    }
}
