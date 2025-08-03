package com.itheima.homework;

/*
    定义一个byte类型的变量，为其赋值为10，输出结果。
    为其增加13.14，再输出结果。再次为其减去5.2，输出结果
*/
public class OperatorTest1 {
    public static void main(String[] args) {
        byte bt = 10;
        System.out.println(bt);
        bt += 13.14;
        System.out.println(bt);
        bt -= 5.2;
        System.out.println(bt);

    }
}
