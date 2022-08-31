package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 添加用户信息，并获取自增的主键。
     * @param user
     */
    void insertUser(User user);

}
