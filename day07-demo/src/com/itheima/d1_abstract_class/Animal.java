package com.itheima.d1_abstract_class;

public abstract class Animal {
    public abstract void eat();
    public void drink(){
        System.out.println("喝水");
    }
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}
