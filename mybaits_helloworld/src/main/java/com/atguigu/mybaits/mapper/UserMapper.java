package com.atguigu.mybaits.mapper;

import com.atguigu.mybaits.pojo.User;

import java.util.List;

/**
 * @author joakims
 * @create 2022-08-17-0:13
 **/
public interface UserMapper {
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
     void deleteUser();

     User getUserById();

    /**
     * 查询所有的用户信息。
     * @return
     */
     List<User> getAllUser();

    User getUserByUsername(String username);

}
