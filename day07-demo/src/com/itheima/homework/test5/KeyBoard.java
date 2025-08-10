package com.itheima.homework.test5;

public class KeyBoard implements USB {
    @Override
    public void connect() {
        System.out.println("键盘连接");
    }

    @Override
    public void exit() {
        System.out.println("键盘断开");
    }

    public void input() {
        System.out.println("键盘键入");
    }
}
