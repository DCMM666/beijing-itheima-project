package com.itheima.d1_oop_quickstart;

public class Test {
    public static void main(String[] args) {
        // 目标：快速入门面向对象编程
        // 需求：使用对象组织两名大明星的数据

        // 类名 对象名 = new 类名();
        Star star1 = new Star();
        // 给对象的属性赋值
        star1.name = "柳岩";
        star1.age = 18;
        star1.height = 172;
        star1.weight = 55;

        // 查看对象的属性
        System.out.println("姓名:" + star1.name);
        System.out.println("年龄:" + star1.age);
        System.out.println("身高:" + star1.height);
        System.out.println("体重:" + star1.weight);

        star1.study();
        star1.sleep();
        star1.eat();

    }
}
