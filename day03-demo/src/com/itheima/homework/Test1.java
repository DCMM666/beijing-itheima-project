package com.itheima.homework;

import java.util.Scanner;

/*需求:
	让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
*/
public class Test1 {
    public static void main(String[] args) {
        //第一种方法
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("请输入第" + i + "个整数");
        int num1 = sc.nextInt();
        i++;
        System.out.println("请输入第" + i + "个整数");
        int num2 = sc.nextInt();
        i++;
        System.out.println("请输入第" + i + "个整数");
        int num3 = sc.nextInt();
        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("三个整数的最大值为" + max);
        //第二种方法
/*
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "个整数");
            int num = sc.nextInt();
            if (num > max) {
                max = num1;
            }
        }
        System.out.println("三个数的最大值为"+max);*/

    }
}
