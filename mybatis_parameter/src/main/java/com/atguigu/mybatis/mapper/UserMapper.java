package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据用户名查询用户信息。
     * @return
     */
    User getUserByUsername(String username);

    User getUserById();

    /**
     * 验证登录。
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);

    /**
     * 自定义map键值对，加入到sql语句。
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String ,Object > map);


    /**
     * 插入一个user对象，这个是灵活属性，没有将sql写死。
     * 添加用户信息功能。
     * @param user
     */
    void insertUser(User user);


    /**
     * 验证登录，使用@param注解。
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);


}
