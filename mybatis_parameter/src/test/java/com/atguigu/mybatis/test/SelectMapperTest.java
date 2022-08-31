package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(5);
        System.out.println(user);

        sqlSession.close();

    }

    @Test
    public void getAllUserTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser =  mapper.getAllUser();
        allUser.forEach(System.out::println);
        sqlSession.close();

    }

    @Test
    public void getUserByIdtoMapTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdtoMap(5);
        //{password=123, gender=男, id=5, age=28, email=872065@qq.com, username=song}
        System.out.println(map);

        sqlSession.close();

    }

    @Test
    public void getALlUserToMapTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> allUserToMap = mapper.getAllUserToMap();
        //{password=123, gender=男, id=5, age=28, email=872065@qq.com, username=song}
        System.out.println(allUserToMap);

        sqlSession.close();

    }


}
