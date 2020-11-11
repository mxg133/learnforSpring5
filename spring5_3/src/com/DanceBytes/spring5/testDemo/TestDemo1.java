package com.DanceBytes.spring5.testDemo;

import com.DanceBytes.spring5.config.SpringConfig;
import com.DanceBytes.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 孟享广
 * @date 2020-11-11 2:52 下午
 * @description
 */
public class TestDemo1 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

//    纯注解开发
    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userSrevice = context.getBean("userService", UserService.class);
        userSrevice.add();
    }
}
