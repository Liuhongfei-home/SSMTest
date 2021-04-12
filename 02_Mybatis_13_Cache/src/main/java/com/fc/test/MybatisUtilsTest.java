package com.fc.test;

import com.fc.bean.Student;
import com.fc.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MybatisUtilsTest {
    @Test
    public void test1(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession = factory.openSession();

            StudentDao mapper = sqlSession.getMapper(StudentDao.class);

            Student student1 = mapper.findById(1);
            System.out.println(student1);
            //sqlSession.clearCache();
            //sqlSession.commit();
            //sqlSession.rollback();
            //sqlSession.close();
            Student student2 = mapper.findById(1);


            System.out.println(student2);
            System.out.println(student1 == student2);

            //clearCache 、commit 、rollback 都会把一级缓存清空



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLevel2Cache(){
        try{
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = factory.openSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);

            List<Student> list = mapper.findAll();
            for (Student student : list) {
                System.out.println(student);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
