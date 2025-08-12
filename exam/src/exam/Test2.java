package exam;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(23) + 66;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else {
                str += arr[i] + ",";
            }
        }
        System.out.println(str);
        int oddNumberSum = 0;
        int evenNumberSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumberSum += arr[i];
            } else {
                oddNumberSum += arr[i];
            }
        }
        System.out.println("偶数和" + evenNumberSum);
        System.out.println("奇数和" + oddNumberSum);
    }
}
