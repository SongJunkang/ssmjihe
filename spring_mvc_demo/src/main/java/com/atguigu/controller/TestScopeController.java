package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){

        ModelAndView modelAndView= new ModelAndView();
        /**
         * ModelAndView 包含Model和view的功能。
         * Model:向请求域中共享数据。
         * VIew 设置逻辑视图实现页面跳转。
         */

        modelAndView.addObject("testRequestScope","hello,ModelAndView");

        //设置逻辑视图
        modelAndView.setViewName("success");

        return modelAndView;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){

        model.addAttribute("testRequestScope","hello,ModelAndView");

        return "success";

    }

}
