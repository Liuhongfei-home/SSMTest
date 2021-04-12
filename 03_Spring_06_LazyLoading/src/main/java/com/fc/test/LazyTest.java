package com.fc.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object student = context.getBean("student");
        Object student2 = context.getBean("student");

        System.out.println(student==student2);
    }
}
