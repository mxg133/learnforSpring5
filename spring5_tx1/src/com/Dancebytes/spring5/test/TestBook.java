package com.Dancebytes.spring5.test;

import com.Dancebytes.spring5.service.UserService;
import config.TXConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

/**
 * @author 孟享广
 * @date 2020-11-12 4:50 下午
 * @description
 */
public class TestBook {

    @Nullable
    private String bookName;

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TXConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式创建对象 交给Spring进行管理
    @Test
    public void test3(){
        //1 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2 调用context的方法对象注册
        context.refresh();
//        context.registerBean(User.class, () ->new User());
        context.registerBean("user1", User.class, () ->new User());
        //3 获取在spring注册的对象
//        User user = (User)context.getBean("com.Dancebytes.spring5.test.User");
        User user1 = (User)context.getBean("user1");
        System.out.println(user1);
    }
}
