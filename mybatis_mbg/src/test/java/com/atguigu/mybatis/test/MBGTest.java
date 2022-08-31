package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGTest {

    @Test
    public void MBGTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(2);
//        System.out.println(emp);

        EmpExample empExample = new EmpExample();
        //empExample.createCriteria().andEmpNameEqualTo("张三");
        //开启分页功能。
        PageHelper.startPage(1,2);
        List<Emp> emps = mapper.selectByExample(null);

        emps.forEach(System.out::println);
    }
}
