package com.atguigu.mybaits.test;

import com.atguigu.mybaits.mapper.UserMapper;
import com.atguigu.mybaits.pojo.User;
import com.atguigu.mybaits.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author joakims
 * @create 2022-08-17-0:30
 **/
public class MyBaitsTest {

    @Test
    public void testInsert() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//创建SqlSessionFactoryBuilder对象
         SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
         SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
         SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
         SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
         UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，
        // 通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句

        int result = userMapper.insertUser();
        //提供sql语句的唯一标识，来找到sql并执行。唯一标识是namespace的id。
        //底层的具体实现逻辑。
        //int result1 = sqlSession.insert("com.atguigu.mybaits.mapper.UserMapper.insertUser");
        //sqlSession.commit();
        System.out.println("结果："+result);


         //提交事务处理。
        sqlSession.commit();
        //此为会话，最后需要关闭。
        sqlSession.close();
    }

    @Test
    public void testupdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSessio();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testdelete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSessio();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser();
        sqlSession.close();
    }


    @Test
    public void testgetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSessio();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById();
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testgetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSessio();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.getAllUser();
        list.forEach(System.out::println);


        sqlSession.close();
    }
    @Test
    public void testgetuserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSessio();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserByUsername("song");
        System.out.println(user);



        sqlSession.close();
    }
}
