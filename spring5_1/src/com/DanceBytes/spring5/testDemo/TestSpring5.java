package com.DanceBytes.spring5.testDemo;

import com.DanceBytes.spring5.Book;
import com.DanceBytes.spring5.Order;
import com.DanceBytes.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 孟享广
 * @date 2020-11-07 11:38 上午
 * @description
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);

        user.add();
    }

    @Test
    public void testbook1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemp();
    }

    @Test
    public void testorder(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);

        System.out.println(order);
        order.show();
    }
}
