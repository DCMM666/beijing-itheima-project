package com.itheima.d1_abstract_class;

public class Test {
    public static void main(String[] args) {
        // 目标：认识抽象类，理解抽象类的特点和注意事项
        /*
            1. 被abstract修饰的类就是抽象类
            2. 被abstract修饰的方法就是抽象方法
            3. 抽象类中可以存在抽象方法 , 也可以存在非抽象方法
            4. 抽象类不能实例化,不能创建对象
            5. 抽象类的子类要么重写所有的抽象方法 ,要么子类是一个抽象类
            6. 抽象方法必须存在抽象类中
         */

        // 抽象类是否可以创建对象 ? 不能创建对象
        // Animal a = new Animal();
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
        Cat cat = new Cat();
        cat.eat();
        cat.drink();

    }
}
