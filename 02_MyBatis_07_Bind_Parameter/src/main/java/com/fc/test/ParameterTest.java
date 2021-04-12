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
import java.util.HashMap;
import java.util.Map;

public class ParameterTest {

    @Test
    public void ArgsTest(){
        //测试使用args序号参数绑定
        try {

            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession=factory.openSession();

            StudentDao mapper=sqlSession.getMapper(com.fc.dao.StudentDao.class);

            Student student=mapper.findByIdAndName(2,"古力娜扎");
            System.out.println(student.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //测试使用param序号参数绑定
    @Test
    public void ParamTest(){
        try {

            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession=factory.openSession();

            StudentDao mapper=sqlSession.getMapper(com.fc.dao.StudentDao.class);

            Student student=mapper.findByIdAndAge(3,27);
            System.out.println(student.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //测试使用注解参数绑定
    @Test
    public void testAnnotation(){
        try {

            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession=factory.openSession();

            StudentDao mapper=sqlSession.getMapper(com.fc.dao.StudentDao.class);

            Student student=mapper.findByNameAndAge("伍六七",18);
            System.out.println(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //测试使用Map参数绑定
    @Test
    public void testMap(){
        try {

            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession=factory.openSession();

            StudentDao mapper=sqlSession.getMapper(com.fc.dao.StudentDao.class);

            Map<String, Object> map = new HashMap<>();
            //如果当前键不存在，添加对应的键值对，如果健存在，则传入对应的输赢键值对 attribute
            map.put("name","日他龙龙");
            map.put("gender","男");


            Student student=mapper.findByNameAndGender(map);
            System.out.println(student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //测试使用对象参数绑定
    @Test
    public void testStudent(){
        try {

            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession=factory.openSession();

            StudentDao mapper=sqlSession.getMapper(com.fc.dao.StudentDao.class);

            Student student=new Student();
            student.setId(4);
            student.setName("逸凌晨");

            System.out.println(student);
            Student result=mapper.findByStudent(student);
            System.out.println(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




































