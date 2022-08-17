package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public static SqlSession getSqlSession() {
        SqlSession sqlSession =null;

        try {

            //获取核心配置文件的输入流。
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlsessionFactoryBuild 对象，
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder =new SqlSessionFactoryBuilder();
            //FactoryBuild对象的build 方法，去生成工厂模式的实例对象。
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
           //在获取sqlsession对象，
            sqlSession = sqlSessionFactory.openSession(true);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return sqlSession;
    }
}
