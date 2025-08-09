package com.itheima.d10_static_utils;


public class Test {
    public static void main(String[] args) {
        // 目标：掌握工具类的用法
        /*
            Math工具类：方法都和数学运算相关
         */

        // 获取一个数字的绝对值
        int abs = Math.abs(-100);
        System.out.println("abs = " + +abs);

        // 将小数向上取整
        double ceil = Math.ceil(5.1);
        System.out.println("ceil = " + ceil);
        // 将小数向下取整
        double floor = Math.floor(5.999);
        System.out.println("floor = " + floor);

        // 将小数四舍五入
        long round = Math.round(5.2);
        System.out.println("round =" + round);

        // 获取两个数字的较大值
        int max = Math.max(100, 50);
        System.out.println("max = " + max);

        // 获取两个数字的较小值
        int min = Math.min(-10, -9);
        System.out.println("min = " + min);
        // 获取a的b次方
        double pow = Math.pow(5, 5);
        System.out.println("pow = " + pow);
    }
}
