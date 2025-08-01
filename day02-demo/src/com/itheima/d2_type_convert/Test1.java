package com.itheima.d2_type_convert;

public class Test1 {
    public static void main(String[] args) {
        // 目标：认识数值类型的自动类型转换
        int num1 = 10;
        System.out.println("num2 = " + (float) num1);
        // int 自动类型转换成 double
        int num3 = 100;
        System.out.println("num3 = " + (double) num3);
        // 需求 : 把 long 类型的数据 赋值给 float 类型的变量
        float num4 = 1000L;
        System.out.println("num4 = " + num4);
    }
}
