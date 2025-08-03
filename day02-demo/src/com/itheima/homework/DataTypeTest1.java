package com.itheima.homework;

/*
    在IDEA中写一个Java程序，能够分别定义一个整数变量，为其赋值为10，
    一个float类型的变量，为其赋值13.14。定义一个long类型的的数据，
    为其赋值123456789123456;一个布尔类型变量，为其赋值为false。
    一个字符变量，为其赋值'我',最后把这些变量的结果输出来。
 */
public class DataTypeTest1 {
    public static void main(String[] args) {
        int num1 = 10;
        float num2 = 13.14F;
        long num3 = 123456789123456L;
        boolean flag = false;
        char ch = '我';
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(flag);
        System.out.println('我');
    }
}
