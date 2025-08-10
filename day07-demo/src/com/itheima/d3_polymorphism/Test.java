package com.itheima.d3_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握多态的语法，并理解多态的特点
        Animal a = new Dog();
        //调用成员变量时候需要看左边(Animal父类中有没有该成员变量),编译看左边(父类没有则爆红),运行时候也看左边(子类和父类都有此变量结果为父类变量)
        //System.out.println()
        System.out.println(a.age);//用父类的100
        //调用方法 编译看左边,运行看右边 调用方法时候则先用子类方法,子类没有则继承父类方法
        a.eat();
    }
}
