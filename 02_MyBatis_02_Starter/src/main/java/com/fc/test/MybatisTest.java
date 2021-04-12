package com.fc.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class MybatisTest {
        //以下代码：固定格式，不要问
        @Test
        public void test(){

            //提取资源

            SqlSession sqlSession=null;


            try {
                //1、加载配置文件到字符流中
                //字符流只能读取纯文本文件，字节流都可以读取，但是速度比字符流慢，因为一个字符占两个字节
                Reader resourceAsReader = Resources.getResourceAsReader("mybatis-config.xml");
                //InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

                // 2、获取会话工厂
                SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsReader);

                //3、从工厂里获取SqlSession，相当于jdbc中的Connection
                sqlSession=factory.openSession();

                System.out.println(sqlSession);

                //4、执行sql语句
                int affectedRows = sqlSession.insert("StudentMapper.add");

                //5、提交事务
                sqlSession.commit();

                System.out.println("受影响行数："+affectedRows);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                //6、关闭资源
                   if (sqlSession!=null){
                       sqlSession.close();
                   }

            }


        }
}
