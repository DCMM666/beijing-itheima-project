package com.itheima.d1_method;

/*

    break  : 结束所在的 switch 或者 循环
    return : 结束方法
 */
public class Test4 {
    public static void main(String[] args) {
        getDivide(25, 0);


    }

    /*
        需求：设计一个方法，可以接收两个整数作为参数，方法内部计算并打印两个整数相除的结果，
     */

    public static void getDivide(int num1, int num2) {
        double result;
        if (num2 == 0) {
            System.out.println("除数不能为0");
            return;
        }
        result = num1 / num2;
        System.out.println(result);



    }
}
