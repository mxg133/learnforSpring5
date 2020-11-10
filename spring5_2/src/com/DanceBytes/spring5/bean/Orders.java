package com.DanceBytes.spring5.bean;

/**
 * @author 孟享广
 * @date 2020-11-10 2:59 下午
 * @description
 */
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("1.默认构造函数被调用····");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2.调用了set()····");
    }

    //创建执行的初始化的方法
    public void initMethod() {
        System.out.println("3.执行初始化的方法····");
    }

    public void destoryMethod() {
        System.out.println("5.执行销毁的方法···");
    }
}
