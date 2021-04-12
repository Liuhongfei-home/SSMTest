package com.fc.test;

import com.fc.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    //通过无参构造创建对象
   @Test
    public void testConstructor(){
       //获取Spring容器
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       Object student = context.getBean("student");
       System.out.println(student);

   }

   //通过工厂方法获取对象
   @Test
    public void testFactory(){
       //获取Spring容器
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       Student contextBean = (Student) context.getBean("studentByFactory");

       System.out.println(contextBean);

   }
    //通过工厂方法获取对象
    @Test
    public void testStaticFactory(){
        //获取Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student contextBean = (Student) context.getBean("studentStaticFactory");

        System.out.println(contextBean);

    }
}
