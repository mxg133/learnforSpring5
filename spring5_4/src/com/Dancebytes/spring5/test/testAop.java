package com.Dancebytes.spring5.test;

import com.Dancebytes.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 孟享广
 * @date 2020-11-12 11:55 上午
 * @description
 */
public class testAop {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }
}
