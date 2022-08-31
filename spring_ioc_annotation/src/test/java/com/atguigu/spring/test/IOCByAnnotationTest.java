package com.atguigu.spring.test;

import com.atguigu.spring.contoller.UserContoller;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {

    /**
     *注解的4种组件意思。
     */
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserContoller user = ioc.getBean(UserContoller.class);
        user.saveUser();
        // System.out.println();

//        UserService service = ioc.getBean(UserService.class);
//        System.out.println(service);
//
//        UserDao dao = ioc.getBean(UserDao.class);
//        System.out.println(dao);
//
//        UserContoller user = ioc.getBean(UserContoller.class);
//        System.out.println(user);


    }
}
