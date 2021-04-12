package com.fc.test;


import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.List;

public class S_Test {
    @Test
    public void test1(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> list1 = mapper.findAll();


            //clearCache、 commit rollback  会把一级缓存清空
            //sqlSession.clearCache();
            //sqlSession.commit();
            //sqlSession.rollback();

            sqlSession.close();

            sqlSession.commit();
            List<Student> list2 =mapper.findAll();
            System.out.println(list1);
            System.out.println(list2);
            System.out.println(list1==list2);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testLevel2Cache(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession = factory.openSession();

            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> list = mapper.findAll();



        } catch (IOException e) {


        }

    }




}
