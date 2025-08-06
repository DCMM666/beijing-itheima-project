package com.itheima.d1_method;

public class Test6 {
    public static void main(String[] args) {
        // 目标：通过debug的形式理解方法调用的流程
        System.out.println("main方法开始执行");
        study();
        System.out.println("main方法执行完毕");
    }

    public static void study() {
        eat();
        System.out.println("学习");
        sleep();
    }

    public static void eat() {
        System.out.println("吃饭");
    }// 方法执行完毕,代表的是调用位置调用完毕

    public static void sleep() {
        System.out.println("睡觉");
    }
}
