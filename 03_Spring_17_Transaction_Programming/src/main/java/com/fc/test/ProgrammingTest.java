package com.fc.test;

import com.fc.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.math.BigDecimal;

public class ProgrammingTest {
    @Test
    public void testTransfer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService programmingService = context.getBean("programmingService", AccountService.class);

        programmingService.transfer(1, 2, BigDecimal.valueOf(100));

    }
}
