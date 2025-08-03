package com.itheima.homework;

/*
    创建一个Java程序，
    1.定义两个byte类型的变量，分别赋值为10和20。使用程序计算这两个变量相加的结果，并且使用变量接收运算结果。
    2.定义一个byte类型的变量赋值为10，一个char类型的变量赋值为'a',一个float类型的变量赋值为5.2，
    一个double类型的变量赋值为 10，使用程序计算这些变量相加的结果，并且使用变量接收运算结果。
    */
public class TypeExchangeTest2 {
    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 20;
        int sum = num1 + num2;
        System.out.println(sum);
        byte num3 = 10;
        char ch = 'a';
        float num4 = 5.2F;
        double num5 = 10;
        double result = num3 + ch + num4 + num5;
        System.out.println(result);
    }
}
