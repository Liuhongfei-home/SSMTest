package com.fc.test;

import com.fc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 指定junit的运行环境
@RunWith(SpringJUnit4ClassRunner.class)
// 指定通过哪种方式创建Spring容器
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AOPTest {
    // 依赖注入
    @Autowired
    private UserService userService;

    @Test
    public void testAdd() {
        userService.add();
    }

    @Test
    public void testUpdate() {
        userService.update();
    }
}
