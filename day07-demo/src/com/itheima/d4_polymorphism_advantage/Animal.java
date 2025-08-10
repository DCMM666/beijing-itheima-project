package com.itheima.d4_polymorphism_advantage;

public abstract class Animal {
    public abstract void eat();
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉!");
    }
    public void lookDoor(){
        System.out.println("狗看大门!");
    }
}
class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼!");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠!");
    }
}
class Pig extends Animal{

    @Override
    public void eat() {
        System.out.println("猪吃白菜!");
    }
    public void sleep(){
        System.out.println("猪睡觉");
    }
}
