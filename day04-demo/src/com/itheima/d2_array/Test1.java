package com.itheima.d2_array;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 目标：掌握数组的定义和动态初始化，学会访问数组的长度和数组中的元素
        // 动态初始化数组的语法格式：数组中元素的类型[] 数组名 = new 数组中数据的类型[数组中元素的个数];
        // 需求：定义一个小数类型的数组，用来存储6名同学的考试分数

        // 定义一个长度为 6 的数组 , 数组中存储的元素类型必须是 double 类型
        double[] arr =new double[6];
        printArr(arr);
        System.out.println("-------------");
        arr[1]=88.8;
        arr[3]=99.9;
        arr[5]=101.1;
        printArr(arr);
    }
    public static void printArr(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
