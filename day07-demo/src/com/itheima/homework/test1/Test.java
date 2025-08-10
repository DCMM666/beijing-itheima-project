package com.itheima.homework.test1;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("p001", "张三", 13000);
        Cook cook = new Cook("p002", "李四", 7000);
        manager.eat();
        manager.workMethod();
        System.out.println("---------------");
        cook.eat();
        cook.workMethod();
    }
}
