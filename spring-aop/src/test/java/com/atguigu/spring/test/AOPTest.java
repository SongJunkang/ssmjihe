package com.atguigu.spring.test;

import com.atguigu.spring.aop.annotation.Calculator;
import com.atguigu.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void testAopByAnnotation(){
        ApplicationContext ioc  = new ClassPathXmlApplicationContext("aop-annotation.xml");
//org.springframework.beans.factory.NoSuchBeanDefinitionException ,设置代理之后，就无法在直接调用目标对象
//        CalculatorImpl calculator = ioc.getBean(CalculatorImpl.class);
//        int result = calculator.add(1, 2);

        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(10 ,2);


    }

//    @Test
//    public void testString(){
//        String fmt = "88_%s";
//        return String.format(fmt,);
//    }
}
