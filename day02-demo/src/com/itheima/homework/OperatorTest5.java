package com.itheima.homework;

import java.util.Scanner;

/*
    键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
*/
public class OperatorTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int input = sc.nextInt();
        String result = input % 2 == 0 ? "偶数" : "奇数";
        System.out.println(result);
    }
}
