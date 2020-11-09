package com.DanceBytes.spring5.collectiontype;

import java.util.List;

/**
 * @author 孟享广
 * @date 2020-11-09 5:24 下午
 * @description
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void show() {
        System.out.println(list);
    }
}
