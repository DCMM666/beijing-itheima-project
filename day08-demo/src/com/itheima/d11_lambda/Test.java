package com.itheima.d11_lambda;

public class Test   {
    public static void main(String[] args) {
        // 目标：掌握Lambda表达式的基本使用
        /*
            Lambda表达式是用来简化函数式接口的匿名内部类写法
                函数式接口：有且只有一个抽象方法的接口
         */
        useInterA((num1 ,num2)->{
            return num1+num2;
        });
    }
    public static void useInterA(InterA interAImpl){
        //class interA implements InterA
        int sum = interAImpl.getSum(10, 20);
        System.out.println("sum = " + sum);
    }

}
@FunctionalInterface
interface InterA {
    public abstract int getSum(int num1 ,int num2);
}
