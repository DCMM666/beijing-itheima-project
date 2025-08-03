package com.itheima.homework;

/*
    练习基本数据类型之间的相互转换
    定义int类型变量,为其赋值为10，将其赋值给double类型，查看结果。
    定义byte类型变量，为其赋值100，将其赋值给short类型，查看结果。
    定义byte类型变量，为其赋值80，将其赋值给int类型，查看结果。
    定义double类型变量，为其赋值3.66，将其赋值给int类型，查看结果。
*/
public class TypeExchangeTest1 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b);
        byte c = 100;
        short d = c;
        System.out.println(d);
        byte e = 80;
        int f = e;
        System.out.println(f);
        double g = 3.66;
        int h = (int) g;
        System.out.println(h);

    }
}
