package com.itheima.d4_scanner;

import java.util.Scanner;

/*
    键盘录入三个数据, 求最大值
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;
        System.out.println("三个数中最大的值是: " + max);

    }
}
