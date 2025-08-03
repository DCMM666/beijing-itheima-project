package com.itheima.d9_random;

// 1. 导包

import java.util.Random;


public class Test {
    public static void main(String[] args) {
        // 目标：掌握随机数Random类的使用
        Random random = new Random();
        int num1 = random.nextInt(5)+1;
        System.out.println(num1);


    }
}
