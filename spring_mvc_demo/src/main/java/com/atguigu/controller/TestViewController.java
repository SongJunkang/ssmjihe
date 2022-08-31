package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestViewController {

    @RequestMapping("test/view/thymeleaf")
    public String testThymeleafView(){

        return "success";
    }

    @RequestMapping("test/view/forward")
    public String testInternalResoutceView(){
    //这个为简单转发页面，没有进行渲染。无法显示动态数据。
        return "forward:/test/model";
    }

}
