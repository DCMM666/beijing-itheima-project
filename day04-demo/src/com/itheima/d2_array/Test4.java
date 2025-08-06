package com.itheima.d2_array;


public class Test4 {
    public static void main(String[] args) {
        // 需求：设计一个方法，可以接收一个数组作为参数，方法内计算并返回数组中的最大值
        int[] arr = {23, 35, 25, 16, 7, 9};
        int max = getMax(arr);
        int min = getMin(arr);
        System.out.println(max);
        System.out.println(min);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
