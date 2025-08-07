package com.itheima.d1_oop_quickstart;

public class Phone {
    String brand;
    String color;
    double price;

    public void call(String name) {
        System.out.println("给"+name+"打电话!");
    }

    public void music() {
        System.out.println("听音乐");
    }

    public void video() {
        System.out.println("刷视频");
    }
    public void show(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(price);
    }
}
