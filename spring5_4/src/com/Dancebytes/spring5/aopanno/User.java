package com.Dancebytes.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author 孟享广
 * @date 2020-11-12 11:24 上午
 * @description
 *    被增强的类
 */

@Component
public class User {
    public void add() {
//        int i = 12 / 0;
        System.out.println("User add()....");
    }
}
