package com.Dancebytes.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 孟享广
 * @date 2020-11-12 2:51 下午
 * @description
 */
@Component
@Aspect//表示此类是增强类
@Order(1)
public class PersonProxy {

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "execution(* com.Dancebytes.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("PersonProxy.brfore....");
    }

}
