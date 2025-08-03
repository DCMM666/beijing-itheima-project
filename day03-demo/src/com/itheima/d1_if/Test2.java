package com.itheima.d1_if;


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
            目标：掌握双路if-else语句的写法，并理解其执行流程
            语法：
            if (条件) {
                语句体1;
            } else {
                语句体2;
            }
         */


        // 需求：期末考试结束了，小明同学考了78分，请设计一段程序，判断小明同学考试是否通
        // 规则是：如果考试成绩大于等于60分，在控制台输出考试通过，否则输出考试挂科。
        int score = 78;
        if (score >= 60) {
            System.out.println("考试合格!");
        } else {
            System.out.println("考试挂科!");
        }


        System.out.println("---------------------");

        //  需求：发红包，假设520到了，你要给女朋友发520，请使用程序判断你的微信钱包零钱够不够
        // 定义变量模拟钱包余额

        int money = 1000;
        if (money >= 520) {
            System.out.println("发送红包!");
        } else {
            System.out.println("余额不足!");
        }
        System.out.println("---------------------");



        //模拟用户登录
        String username = "root";
        String password = "123qwer";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String user = sc.next();
        System.out.println("请输入密码:");
        String pwd = sc.next();
        if (user.equals(username) && pwd.equals(password)) {
            System.out.println("登录成功!");
        } else {
            System.out.println("登录失败!");
        }


    }
}
