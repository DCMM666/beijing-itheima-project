package com.itheima.d1_visibility_modifier1;

public class Test {
    public static void main(String[] args) {
        // 目标：理解Java中四种权限修饰符的可见范围
        // 同一个包下的其他类中，除了私有的，都能访问
        Animal.publicMethod();
        Animal.protectedMethod();
        Animal.method();
    }
}
