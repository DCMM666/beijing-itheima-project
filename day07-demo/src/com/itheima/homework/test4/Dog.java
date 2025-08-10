package com.itheima.homework.test4;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("体重" + getWeight() + "斤的" + getName() + "在吃骨头!");
    }

    public void lookHome() {
        System.out.println("体重" + getWeight() + "斤的" + getName() + "在老老实实看家");
    }
}
