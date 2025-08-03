package com.itheima.homework;

import java.util.Scanner;

/*
    键盘录入自己的姓名(String),年龄(int),身高(double)保存到对应的变量中,
    输出结果如:我的姓名是张三,年龄25岁,身高180CM
    (提示姓名是String类型,需要使用Scanner的next()方法.)
*/
public class OperatorTest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String name = sc.next();
        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();
        System.out.println("请输入你的身高:");
        double height = sc.nextDouble();
        System.out.println("我都姓名是" + name + "年龄" + age + "身高" + height + "cm");
    }
}
