package com.itheima.d1_if;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
            目标：掌握多路if-else if-else语句的写法，并理解其执行流程

            期末考试结束了，键盘录入小明考试分数，教育局规定，不允许告诉学生具体的考试分数，请设计一段程序，
            用来打印考试分数等级，分数等级规则如下：
            如果分数大于等于90分且小于等于100分，等级为A
            如果分数大于等于80分且小于90分，等级为B
            如果分数大于等于60分且小于80分，等级为C
            如果分数小于60分，等级为D
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的分数:");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 60 && score < 80) {
            System.out.println("C");
        } else if (score < 60) {
            System.out.println("D");
        } else {
            System.out.println("输入分数错误!");
        }


    }
}
