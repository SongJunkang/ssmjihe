package com.atguigu.spring;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Person;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {
    @Test
    public void testIOC(){

        /**
         * 获取bean的三种方式；
         * 1.根据bean的id获取。
         * 2.根据bean的类型获取。最常使用的方法。
         * 注意：根据bean的类型获取，要求IOC容器中有且只有一个类型匹配的Bean
         * 若没有任何一个类型匹配的bean，抛出异常：NoSuchbean。
         * 3。第一种和第二种的集合，先id，然后类型获取。
         *
         */

        //获取IoC容器。
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");

        //获取bean
        Student studentOne = (Student) ioc.getBean("studentOne");

        Student bean1 = ioc.getBean(Student.class);


        Student studentOne1 = ioc.getBean("studentOne", Student.class);

        Person student1 = ioc.getBean(Student.class);
        Person pers = ioc.getBean(Person.class);
        System.out.println(pers);


    }

    @Test
    public void testDI(){
        //获取IoC容器。
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student studentTwo = ioc.getBean("studentSix", Student.class);
        System.out.println(studentTwo);

    }

    @Test
    public void testDI1(){
        //获取IoC容器。
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
//        Student studentTwo = ioc.getBean("studentFive", Student.class);
//        System.out.println(studentTwo);
        Clazz clazz = ioc.getBean("clazzone", Clazz.class);
        System.out.println(clazz);
    }

}
