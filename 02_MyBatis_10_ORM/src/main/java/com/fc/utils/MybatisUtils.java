package com.fc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * MyBatis工具类
 *
 * 封装了获取连接，关闭连接，获取接口实现类对象的方法
 */

public class MybatisUtils {

    //准备SqlSession工厂对象
    private  static SqlSessionFactory factory;

    //创建ThreadLocal 绑定当前线程中的SqlSession对象
    private  static final ThreadLocal<SqlSession> THREAD_LOCAL=new ThreadLocal<>();

    //通过静态代码块加载SqlSession工厂对象(只运行一次)
    static {
        try {
            //读取配置文件
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            //获取工厂对象
            factory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 获取sqlSession
     * 获得连接（从TheeadLocal）中获得当前线程SqlSession)
     * @return
     */
    private static SqlSession openSession(){
        //首先从ThreadLocal中获取SqlSession
        SqlSession sqlSession=THREAD_LOCAL.get();

        //如果没有拿到
        if (sqlSession ==null){

            //从工厂对象中获取连接
            sqlSession=factory.openSession();

            //将连接存入ThreadLocal
            THREAD_LOCAL.set(sqlSession);
        }
        return sqlSession;
    }

    /**
     * 获取接口实现类
     */
    public static <T> T getMapper(Class<T> clazz){
        //获取sqlSession
        SqlSession sqlSession=openSession();

        return sqlSession.getMapper(clazz);
    }

    //释放连接（释放当前线程中的SqlSession）
    private static  void close(){
        //从ThreadLocal中获取连接
        SqlSession sqlSession=THREAD_LOCAL.get();

        //关闭连接
        sqlSession.close();

        //从ThreadLocal 中移除连接
        THREAD_LOCAL.remove();
    }

    //提交事务（提交当前线程中的SqlSession所管理的事务）
    public    static  void commit(){
        //获取连接
        SqlSession sqlSession=openSession();

        //提交事务
        sqlSession.commit();

        //关闭资源
        close();

    }
    //回滚事务(回滚当前线程中的SqlSession所管理的事务)
    public static void rollBack(){
        //获取连接
        SqlSession sqlSession=openSession();

        //回滚
        sqlSession.rollback();

        //关闭
        close();
    }





}
