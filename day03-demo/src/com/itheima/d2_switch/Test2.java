package com.itheima.d2_switch;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 目标：使用switch的穿透性简化代码
        /*
          case穿透 打印季节
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入月份:");
        int month =sc.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入信息有误!");
                break;
        }
    }
}
