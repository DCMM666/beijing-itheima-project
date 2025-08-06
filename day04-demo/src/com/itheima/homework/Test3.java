package com.itheima.homework;

/*需求:
	现有一个整数数组{100,50,90,60,80,70}。
	请编写一个方法，方法可以接收一个整型数组，
	方法内计算数组中的所有元素的最小值并返回，
	在主方法中调用计算数组最小值的方法获取数组的最小值并将结果打印在控制台。
	*/
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        int min = getMin(arr);
        System.out.println("数组中的最小值为:"+min);

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
