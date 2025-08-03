package com.itheima.homework;

import java.util.Scanner;

/*
    键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,
    如果成绩小于60输出”不及格”
*/
public class OperatorTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数:");
        int score = sc.nextInt();
        String result = score >= 60 ? "及格" : "不及格";
        System.out.println(result);
    }
}
