package com.itheima.d2_visibility_modifier2;


import com.itheima.d1_visibility_modifier1.Animal;

public class Cat {
    public static void main(String[] args) {
        // 不同包下的无关类中，只能访问public修饰的成员
        Animal.publicMethod();
    }
}
