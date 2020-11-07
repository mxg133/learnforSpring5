package com.DanceBytes.spring5;

/**
 * @author 孟享广
 * @date 2020-11-07 3:18 下午
 * @description
 */
public class Order {
    private String oname;
    private String oaddress;

    public Order(String oname, String oaddress) {
        this.oname = oname;
        this.oaddress = oaddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oname='" + oname + '\'' +
                ", oaddress='" + oaddress + '\'' +
                '}';
    }

    public void show() {
        System.out.println(oname + " -> " + oaddress);
    }
}
