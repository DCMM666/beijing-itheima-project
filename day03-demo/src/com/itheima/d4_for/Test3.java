package com.itheima.d4_for;

public class Test3 {
    public static void main(String[] args) {
        // 需求；计算1-100之间的奇数和，并把结果输出到控制台。
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1-100的奇数和为" + sum);
    }
}
