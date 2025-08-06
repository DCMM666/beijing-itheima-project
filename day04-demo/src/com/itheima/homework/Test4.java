package com.itheima.homework;

/*需求:
	现有一个整数数组{100,50,90,60,80,70}。
	请编写一个方法，方法可以接收一个整型数组，方法内计算数组中的所有元素的最大值并返回，
	在主方法中调用计算数组最大值的方法获取数组的最大值并将结果打印在控制台。
	*/
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        int max = getMax(arr);
        System.out.println(max);
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
}
