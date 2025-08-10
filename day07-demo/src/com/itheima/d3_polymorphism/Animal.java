package com.itheima.d3_polymorphism;

public class Animal {
    int age = 100;
    public void eat(){
        System.out.println("父类的eat方法");
    }
}

class Dog extends Animal{
    int age = 10;
    @Override
    public void eat() {
        System.out.println("子类的eat方法" );
    }
    public void lookDoor(){
        System.out.println("看门");
    }
}