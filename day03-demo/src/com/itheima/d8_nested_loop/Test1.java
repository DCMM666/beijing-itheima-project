package com.itheima.d8_nested_loop;

/*
    System.out.println(数据) : 把数据打印在控制台,并换行
    System.out.println() : 换行
    System.out.print(数据) : 把数据打印在控制台
 */
public class
Test1 {
    public static void main(String[] args) {
        // 目标：掌握嵌套循环的写法，并理解其执行流程
        // 嵌套循环的执行特点：外层循环每执行一次，内层循环执行完一轮

        /*
            ****
            ****
            ****
            需求: 一颗颗打印
         */
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("---------------");

         /*
            *
            **
            ***
            ****
            需求: 一颗颗打印
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }

       /* String temp = "";
        int count = 0;
        for (int i = 0; i < 5; i++) {
            temp +="*";
            count++;
            System.out.println(temp);
        }
        System.out.println(count);
*/

        //System.out.println("---------------");


    }
}
