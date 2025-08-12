package com.itheima.d2_visibility_modifier2;

import com.itheima.d1_visibility_modifier1.Animal;

public class Dog extends Animal {
    public static void main(String[] args) {
        // 不同包下的子类中，能访问protected修饰的和public修饰的成员
        Animal.publicMethod();
        Animal.protectedMethod();
    }
}
