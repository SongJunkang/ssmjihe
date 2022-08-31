package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    /**
     * 通过id查询客户，
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Map<String, Object> getUserByIdtoMap(@Param("id") Integer id);


    @MapKey("id")
    Map<String,Object> getAllUserToMap();

}

