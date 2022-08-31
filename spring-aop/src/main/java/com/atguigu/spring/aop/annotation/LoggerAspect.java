package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * 在切面中，需要通过指定的注解将方法标记为通知方法：
 * @before：前置通知，在目标对象方法执行之前执行 。
 * @After:后置通知，在目标对象方法的finally字句中执行的。
 * @AfterReturning 返回通知，在目标对象方法返回值之后执行。
 * @AfterThrowing:异常通知，也叫例外通知，在目标对象方法的catching字句中执行。
 *
 * @Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int ,int))")
 * 切入点表达式：Before("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
 * 第一个*：表示任意的访问修饰符和返回值类型。
 * 第二个*：表示类中的任意方法：
 * 。。表示任意的参数列表。
 * 类的地方也是可以使用*，表示包下所有的类。
 *
 * 3.获取连接点的信息。
 * 在通知方法的参数位置，设置JoinPoint类型的参数中，就可以获取连接点所对应方法的信息。
 *
 * 4.声明一个重用的切入点表达式，使用方式：
 *    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
 *     public  void pointCut(){};
 */
@Component
@Aspect  //将当前组件标识为切面 。
public class LoggerAspect {

    //切入点表达式复用。
    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    public  void pointCut(){};

    //@Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int ,int))")
    @Before("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    public void beforeAdviceMethod(JoinPoint joinPoint){

        //获取连接点所对应方法的签名信息。。

        Signature signature = joinPoint.getSignature();

        Object[] args = joinPoint.getArgs();

        System.out.println("LoggerAspect,方法：" + signature.getName() + ",参数 ：" + Arrays.toString(args));

    }

    @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint){

        //获取连接点所对应方法的签名信息。。

        Signature signature = joinPoint.getSignature();

        System.out.println("LoggerAspect，后置通知；");
    }


    //在返回通知中，若要获取目标对象的返回值，只需要通过@AfterReturning注解的returning属性。
    //就可以将通知方法的某个参数指定为接受目标对象方法的返回值的参数。
   @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){

        //获取连接点所对应方法的签名信息。。

        Signature signature = joinPoint.getSignature();

        System.out.println("LoggerAspect，返回通知：" + signature.getName() + ",结果 ：" + result );
    }


    //在返回通知中，若要获取目标对象的异常，只需要通过@AfterThrowing的throwing 属性。
    //就可以将通知方法的某个参数指定为接受目标对象方法执行出现异常的参数。
    @AfterThrowing(value = "pointCut()",throwing = "ex")

    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Throwable ex){
        Signature signature = joinPoint.getSignature();

        System.out.println("LoggerAspect,方法：" + signature.getName() +", 异常：" +ex);


    }
}
