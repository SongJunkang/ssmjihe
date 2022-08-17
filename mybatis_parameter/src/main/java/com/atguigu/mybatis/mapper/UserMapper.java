package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

public interface UserMapper {
    /**
     * 根据用户名查询用户信息。
     * @return
     */
    User getUserByUsername(String username);

    User getUserById();
}
