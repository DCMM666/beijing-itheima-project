package com.itheima.d3_operator;
// 目标：掌握三元运算符的写法和执行流程
// 语法：条件表达式 ? 值1 : 值2
// 需求1：考试了，小明考了89分，请使用程序打印小明是否考试通过，如果通过打印考试通过，否则打印考试不通过
public class Test7 {
    public static void main(String[] args) {
        int x =1000;
        int y =2000;
        int z=500;
        int max =x>y?x:y;
        max =max>z?max:z;
        System.out.println("max = " + max);

    }
}
