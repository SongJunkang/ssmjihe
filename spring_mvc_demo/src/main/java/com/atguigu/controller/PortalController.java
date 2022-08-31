package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalController {

    @RequestMapping("/")
    public String portal(){
        return "index";
    }

    @RequestMapping("/hello")

    public String hello(){
        return "success";

    }

    @RequestMapping("/abc/test/ant")
    public String testAnt(){

        return "success";

    }

    @RequestMapping("/test/rest/{id}")
    public String testRest(@PathVariable ("id") Integer id){

        System.out.println("id:"+id);
        return "success";
    }

}
