package com.Dancebytes.spring5.test;

import com.Dancebytes.spring5.entity.Book;
import com.Dancebytes.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 孟享广
 * @date 2020-11-12 4:50 下午
 * @description
 */
public class TestBook {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        Book book = new Book();
//        book.setUserId("3");
//        book.setUsername("java3");
//        book.setUstatus("c");
//        bookService.addBook(book);

//        bookService.updateBook(book);
//        bookService.deleteBook(9);

//        int conutBook = bookService.findConutBook();
//        System.out.println(conutBook);

//        Book oneBook = bookService.findOneBook(2);
//        System.out.println(oneBook);

//        List<Book> allBook = bookService.findAllBook();
//        System.out.println(allBook);

//        List<Object[]> list = new ArrayList<>();
//        Object o1[] = {"4", "cpp4", "d"};
//        Object o2[] = {"5", "oppo5", "e"};
//        Object o3[] = {"6", "vivo6", "f"};
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        bookService.batchAddBook(list);


//        批量修改
//        List<Object[]> list = new ArrayList<>();
//        Object o1[] = {"cpp4", "d1", "4"};
//        Object o2[] = {"oppo5", "e1", "5"};
//        Object o3[] = {"vivo6", "f1", "6"};
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        bookService.batchUpdateBook(list);

//        批量删除
        List<Object[]> list = new ArrayList<>();
        Object o2[] = {"5"};
        Object o3[] = {"6"};
        list.add(o2);
        list.add(o3);
        bookService.batchDeleteBook(list);
    }
}
