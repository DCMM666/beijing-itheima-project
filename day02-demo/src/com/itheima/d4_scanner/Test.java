package com.itheima.d4_scanner;

/*
    目标：学会使用Scanner接收键盘录入的数据

    第一步 : 导包         import java.util.Scanner;                定义包的下面 类的上面
    第二步 : 创建对象      Scanner sc = new Scanner(System.in);     定义在 main 方法中
    第三步 : 录入数据
        String 变量名 = sc.next();
        int 变量名 = sc.nextInt();
        double 变量名 = sc.nextDouble();
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("num1 = " + num1);




    }
}
