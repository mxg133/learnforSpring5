package com.Dancebytes.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 孟享广
 * @date 2020-11-12 11:25 上午
 * @description
 *  增强的类
 */

@Component
@Aspect //代表着要生成代理对象
@Order(3)
public class UserProxy {

//    相同切入点抽取
    @Pointcut(value = "execution(* com.Dancebytes.spring5.aopanno.User.add(..))")
    public void pointdemo() {

    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("brfore....");
    }

//    返回通知
    @AfterReturning(value = "pointdemo()")
    public void afterReturning() {
        System.out.println("afterReturning....");
    }

//    最终通知
    @After(value = "pointdemo()")
    public void after() {
        System.out.println("after....");
    }

//  异常通知
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing....");
    }

//    环绕通知
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around前....");
        //被增强的方法
        proceedingJoinPoint.proceed();
        System.out.println("around后....");
    }


}
