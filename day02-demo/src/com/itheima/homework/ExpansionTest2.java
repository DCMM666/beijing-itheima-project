package com.itheima.homework;

import java.util.Scanner;

/*
    商场推出幸运抽奖活动，抽奖规则如下：
	(1)键盘录入四位数字(1000-9999的数字),作为顾客的会员卡号
	(2)该会员卡号(键盘录入的四位数字)各位数字之和大于20，则为幸运客户
*/
public class ExpansionTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位会员卡号:");
        int vip = sc.nextInt();
        int ge = vip % 10;
        int shi = vip / 10 % 10;
        int bai = vip / 10 / 10 % 10;
        int qian = vip / 10 / 10 / 10 % 10;
        int sum = ge + shi + bai + qian;
        System.out.println("会员卡号之和为:" + sum);
        System.out.println(sum > 20 ? "会员卡号" + vip + "是幸运客户" : "会员卡号" + vip + "不是幸运客户");


    }
}
