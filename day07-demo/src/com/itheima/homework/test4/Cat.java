package com.itheima.homework.test4;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("体重" + getWeight() + "斤的" + getName() + "在吃鱼");
    }

    public void catchMouse() {
        System.out.println("体重" + getWeight() + "斤的" + getName() + "在努力抓老鼠");
    }
}
