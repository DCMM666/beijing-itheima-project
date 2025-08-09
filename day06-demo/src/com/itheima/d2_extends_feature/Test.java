package com.itheima.d2_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承的特征
        // 1.Java是单继承模式，子类只能继承一个直接父类
        // 2.多层继承：Java虽然是单继承，但是支持多层继承
        // 3.祖宗类：Java中所有类，要么直接继承了object，要么默认继承了object，要么间接继承了object, Object是所有类的祖宗类。
        Son s = new Son();
        s.show();
    }
}