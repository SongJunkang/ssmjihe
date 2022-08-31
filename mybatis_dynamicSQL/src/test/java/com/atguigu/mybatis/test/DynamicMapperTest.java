package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSqlMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicMapperTest {

    @Test
    public void testDynamicSqlMapper(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        Emp emp = new Emp(null,"张三",20,"男");
        List<Emp> listresult = mapper.getEmpByCondition(emp);
        System.out.println(listresult);
        }

    @Test
    public void testDynamicSqlMapperByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        Emp emp = new Emp(null,"张三",20,"男");
        List<Emp> listresult = mapper.getEmpByChoose(emp);
        System.out.println(listresult);
    }
}
