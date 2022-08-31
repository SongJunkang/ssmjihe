package com.atguigu.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcess implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //此方法再bean的生命周期初始化之前执行。
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
        //后置处理器

    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //此方法再bean的生命周期初始化之后执行
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
