package com.itheima.homework.test5;

public class Test {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        Computer.use(keyBoard);
        Computer.use(mouse);
    }
}
