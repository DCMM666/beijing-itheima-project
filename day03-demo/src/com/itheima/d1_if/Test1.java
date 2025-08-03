package com.itheima.d1_if;

public class Test1 {
    public static void main(String[] args) {
        /*
            目标：掌握if数据的写法
            第一种：单路if语句
         */

        /*
            需求：
            假设你正在开发一个自动驾驶汽车项目，汽车要经过红绿灯路口了，
            该如何安全通过这个路口呢？
            分析：
            汽车到达路口，要根据红绿灯的状态决定怎样通过；
            每个灯有亮和不亮两种状态，程序中要使用什么类型的变量记录三个灯的状态呢？
         */

        // 定义三个变量 ,记录三个灯的状态
        boolean rad = false;
        boolean green = true;
        boolean yellow = false;
        if (rad) {
            System.out.println("红灯停!");
        }
        if (green) {
            System.out.println("绿灯行!");
        }
        if (yellow) {
            System.out.println("黄灯到了等一等!");
        }
    }
}
