package com.itheima.d2_array;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握静态初始化数组的写法
        // 静态初始化数组适合定义数组的时候就确定了数组中所有元素的场景，比如存储全班同学的年龄、身高、考完试之后的分数
        // 静态初始化数组的完整写法：数组中元素的类型[] 数组名 = new 数组中元素的类型[] {罗列数组中的元素};
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            int num = sc.nextInt();
            arr[i] = num;
        }
        printArr(arr);

    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}
