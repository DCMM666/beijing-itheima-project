package com.itheima.homework.test5;

public class Mouse implements USB {

    @Override
    public void connect() {
        System.out.println("鼠标连接");
    }

    @Override
    public void exit() {
        System.out.println("鼠标断开");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
