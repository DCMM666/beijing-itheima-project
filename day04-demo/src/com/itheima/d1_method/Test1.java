 package com.itheima.d1_method;

/*
`   方法的定义注意事项
        1. 方法与方法之间属于平级关系.不能嵌套
        2. return 值 : 把数据返回给了调用者.并结束方法
 */
public class Test1 {
    // 程序的入口
    public static void main(String[] args) {
        // 目标：掌握方法的定义和调用语法
        // 方法必须被调用才能执行，方法调用的格式：返回值类型 变量名 = 方法名(参数);
        int max = getMax(10, 20);
        System.out.println("max="+max);
        int min =getMin(10,20);
        System.out.println("min="+min);

    }

    /*
        需求：设计一个方法，方法能接收两个整数，方法内计算并返回两个整数的最大值
    */
    public static int getMax(int num1, int num2) {
        int max = num1 > num2 ? num1 : num2;
        return max;
    }

    public static int getMin(int num1, int num2) {
        int min = num1 < num2 ? num1 : num2;
        return min;
    }

}
