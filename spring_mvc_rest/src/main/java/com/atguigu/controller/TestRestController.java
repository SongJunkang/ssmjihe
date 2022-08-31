package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 查询所有的用户的信息-->/User-->get
 * 根据id查询用户的信息-->/User/1-->get
 * 添加用户的信息-->/User-->post
 * 修改用户的信息-->/User-->put
 * 删除用户的信息-->/User/1-->delete
 *
 * 注意浏览器目前只能发送get和post请求
 * 若要发送 put和delete请求，需要在web.xml中配置一个过滤器，hiddenHttpMethodFilter
 */

@Controller
public class TestRestController {

//@RequestMapping(value = "/user",method = RequestMethod.GET)
@GetMapping(value = "/user")
 public String getAllUser(){


    System.out.println("查询所有的用户的信息-->/User-->get");


    return "success";
}

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id){

        System.out.println("根据id查询用户的信息-->/User/" + id +"-->get");

        return "success";

    }


    //@RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户信息-->/user-->put");
        return "success";
    }

    //@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息-->/user/"+id+"-->delete");
        return "success";
    }


}
