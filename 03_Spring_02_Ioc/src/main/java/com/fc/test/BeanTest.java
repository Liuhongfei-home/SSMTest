package com.fc.test;

import com.fc.dao.UserDao;
import com.fc.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void test(){
        //固定格式

       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");

        userDao.getUser();
    }

    @Test
    public void testName(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
