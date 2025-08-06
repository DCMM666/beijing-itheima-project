package com.itheima.homework;

import java.util.Scanner;

/*需求:
    1.根据程序员的工龄(整数)给程序员涨工资(整数),程序员的工龄和基本工资通过键盘录入
    2.涨工资的条件如下：
        [10-15)     +20000
        [5-10)      +10000
        [3~5)       +5000
        [1~3)       +3000
     3.运行程序:
         请输入作为程序员的你的工作的工龄:10
         请输入作为程序员的你的基本工资为:60000
         程序运行后打印格式
         "您目前工作了10年，基本工资为 60000元, 应涨工资 20000元,涨后工资 80000元"
*/
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入作为程序员的你的工作的工龄:");
        int workYear = sc.nextInt();
        System.out.println("请输入作为程序员的你的基本工资为:");
        int salary = sc.nextInt();
        int temp = salary;
        int increase = 0;
        if (workYear >= 10 && workYear < 15) {
            increase = 20000;
            salary += increase;
        } else if (workYear >= 5 && workYear < 10) {
            increase = 10000;
            salary += increase;
        } else if (workYear >= 3 && workYear < 5) {
            increase = 5000;
            salary += increase;
        } else if (workYear >= 1 && workYear < 3) {
            increase = 3000;
            salary += increase;
        } else {
            System.out.println("输入工龄不合法!");
        }
        System.out.println("您目前工作了" + workYear + "年,基本薪资为" + temp + "元,应涨工资" + increase + "元,涨后工资" + salary + "元");


    }
}
