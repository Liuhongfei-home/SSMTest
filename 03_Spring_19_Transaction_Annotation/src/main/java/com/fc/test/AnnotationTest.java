package com.fc.test;

import com.fc.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class AnnotationTest {
    @Test
    public void testTransfer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService accountService = context.getBean("accountService", AccountService.class);


        accountService.transfer(2, 1, BigDecimal.valueOf(100));
    }
}
