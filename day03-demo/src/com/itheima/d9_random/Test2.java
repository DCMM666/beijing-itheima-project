package com.itheima.d9_random;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 需求：朋友聚会时，经常会玩一个叫猜数字的小游戏，
        // 游戏规则是：先让一个人随机想一个1-100之间的整数，然后每个人开始猜，猜大了提示过大，猜小了提示过小，直到猜中结束游戏。
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜的数字:");
            int luckyNumber = sc.nextInt();
            if (luckyNumber > randomNumber) {
                System.out.println("你猜的数据" + luckyNumber + "大了");
            } else if (luckyNumber < randomNumber) {
                System.out.println("你猜的数据" + luckyNumber + "小了");
            } else {
                System.out.println("恭喜您!猜中了!");
                break;
            }
        }
    }
}
