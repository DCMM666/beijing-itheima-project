package com.itheima.d12_lambda_demo;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Test {
    public static void main(String[] args) {
        // 目标：使用Lambda表达式简化匿名内部类的写法
        // Arrays工具类中的setAll方法：将数组中的每一个数据按照指定的规则进行修改

        int[] arr = {33, 44, 22, 11, 55};
        System.out.println(Arrays.toString(arr));
        Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int index) {
                return arr[index] * 100;
            }
        });
        System.out.println(Arrays.toString(arr));

        // 匿名内部类对象就是实现类对象

        System.out.println(Arrays.toString(arr));
        // 使用Lambda表达式简化：
        Arrays.setAll(arr, (int index) -> {return arr[index] * 100;});
        //简化
        Arrays.setAll(arr,  index ->  arr[index] * 100);

        // Arrays工具类中的sort方法可以接收第2个参数指定比较规则排序

    }
}
