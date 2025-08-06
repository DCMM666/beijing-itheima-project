package com.itheima.homework;

/*需求:
	打印出1到100之间的既是3的倍数又是5倍数的数字以及这些数字的和
*/
public class Test3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("和为" + sum);
    }
}
