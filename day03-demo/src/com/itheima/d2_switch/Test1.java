package com.itheima.d2_switch;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
          /*
             注意事项 :
                1. switch 小括号中的数据类型 : byte,short,char,int,String,枚举
                2. case后面的值类型必须和 switch 中变量的类型保持一致
                3. case后面的值不能重复 , case 后面的值只能是字面值

          */

        // 目标：掌握switch语句的写法，并理解其执行流程
        /*
            输入星期打印对应计划
        */
//
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期:");
        int weekDay = sc.nextInt();
        switch (weekDay){
            case 1:
                System.out.println("上班");
                break;
            case 2:
                System.out.println("工作");
                break;
            case 3:
                System.out.println("学习");
                break;
            case 4 :
                System.out.println("玩游戏");
                break;
            case 5:
                System.out.println("旅游");
                break;
            case 6:
                System.out.println("休息");
                break;
            case 7:
                System.out.println("散步");
                break;
            default:
                System.out.println("输入信息错误!");
                break;
        }
    }
}
