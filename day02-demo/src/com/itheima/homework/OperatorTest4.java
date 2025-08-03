package com.itheima.homework;

/*
    已知闰年的规则是：能被4整除同时不能被100整除的是闰年，
    或者能被400整除的也是闰年。
    问2050年是否为闰年，使用程序说明
*/
public class OperatorTest4 {
    public static void main(String[] args) {
        int year = 2025;
        boolean flag = (year / 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("2025年是否为闰年:" + flag);

    }
}
