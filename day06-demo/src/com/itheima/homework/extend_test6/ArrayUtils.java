package com.itheima.homework.extend_test6;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static String toString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i] + "]";
            } else {
                result += arr[i] + ",";
            }
        }

        return result;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        int max = getMax(arr);
        int min = getMin(arr);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum - max - min) / (arr.length - 2);
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
