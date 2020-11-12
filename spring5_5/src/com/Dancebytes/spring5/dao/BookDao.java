package com.Dancebytes.spring5.dao;

import com.Dancebytes.spring5.entity.Book;

import java.util.List;

/**
 * @author 孟享广
 * @date 2020-11-12 4:17 下午
 * @description
 */
public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void delete(int id);

    int selectCount();

    Book findOne(int id);

    List<Book> findAll();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelete(List<Object[]> batchArgs);
}
