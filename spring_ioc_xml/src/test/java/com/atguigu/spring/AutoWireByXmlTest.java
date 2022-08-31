package com.atguigu.spring;

import com.atguigu.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByXmlTest {

    /**
     *
     */
    @Test
    public void testAutoWire(){

        ApplicationContext ioc  = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController bean = ioc.getBean(UserController.class);
        bean.saveUser();
    }
}
