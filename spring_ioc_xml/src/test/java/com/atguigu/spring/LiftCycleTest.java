package com.atguigu.spring;

import com.atguigu.spring.pojo.Student;
import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LiftCycleTest {
    @Test
    public void test(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");

//        User user = ioc.getBean(User.class);
//        System.out.println(user);
//        ioc.close();
    }
}
