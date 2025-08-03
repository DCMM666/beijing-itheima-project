package com.itheima.homework;

import java.util.Scanner;

/*
    小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8可通过键盘录入），要求编写代码交换小明手中的牌
*/
public class ExpansionTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明左手中的纸牌:");
        int left = sc.nextInt();
        System.out.println("请输入小明右手中的纸牌:");
        int right = sc.nextInt();
        System.out.println("互换前小明手中的纸牌：");
        System.out.println("左手中的纸牌:" + left);
        System.out.println("右手中的纸牌:" + right);
        int temp = left;
        left = right;
        right = temp;
        System.out.println("互换后小明手中的纸牌：");
        System.out.println("左手中的纸牌:" + left);
        System.out.println("右手中的纸牌:" + right);

    }
}
