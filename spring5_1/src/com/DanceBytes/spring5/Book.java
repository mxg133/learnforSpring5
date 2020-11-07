package com.DanceBytes.spring5;

/**
 * @author 孟享广
 * @date 2020-11-07 2:55 下午
 * @description
 */
public class Book {
    private String bname;
    private String bauthor;
    private String address;

//    public Book(String bname) {
//        this.bname = bname;
//    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void testDemp() {
        System.out.println(bname + " -> " + bauthor + " -> " + address);
    }
}
