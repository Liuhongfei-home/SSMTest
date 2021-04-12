package com.fc.test;

import com.fc.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class XmlTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = context.getBean("accountService", AccountService.class);

        accountService.transfer(1,2, BigDecimal.valueOf(100));
    }

}
