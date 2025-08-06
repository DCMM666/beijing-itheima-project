package com.itheima.d1_method;

public class Test5 {
    public static void main(String[] args) {
        // 目标：认识方法重载，掌握方法重载的识别技巧
        // 在同一个类中，有多个方法名称相同，参数列表不同，那么这些方法就是重载关系
        // 参数列表不同指的是：参数的个数、类型、顺序不同，只要有其中一个不同即可
        // 判断多个方法是否是重载的方法的时候，不用看前面的修饰符和返回值类型
        getSum(12, 20);
        getSum(1.2, 20);
        getSum(12, 20, 30);
        getSum('a', 'b');
        getSum(true, false);
        getSum("a","b");
    }

    public static void getSum(int a, int b) {
        System.out.println(a + b);
    }

    public static void getSum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void getSum(double a, int b) {
        System.out.println(a + b);
    }

    public static void getSum(char a, char b) {
        System.out.println(a + b);
    }

    public static void getSum(boolean a, boolean b) {
        System.out.println(a ^ b);
    }
    public static void getSum(String a, String b) {
        System.out.println(a + b);
    }


}
