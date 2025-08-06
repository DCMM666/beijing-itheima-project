package com.itheima.homework;

/*需求:
	现有一个整数数组{100,50,90,60,80,70}。
	请编写一个方法，方法内计算去掉最大值和最小值后的平均值（不考虑小数部分）并返回，
	最后在主方法中调用该方法获取结果并打印在控制台。
	*/
public class Test5 {
    public static void main(String[] args) {
        int[] arr = {100, 50, 90, 60, 80, 70};
        int result = getAverage(arr);
        System.out.println("数组去除最大值最小值的平均数为:"+result);
    }

    public static int getAverage(int[] arr) {
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int reuslt = (sum - max -min)/(arr.length-2);
        return reuslt;
        /*int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] != min) {
                resultArr[i] = arr[i];
            }
        }
        int sum = getSum(resultArr);
        int result = sum / (resultArr.length - 2);
        return result;*/
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

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
