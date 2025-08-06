package com.itheima.homework;

import java.util.Scanner;

/*需求:
	从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
		1.数字的个位数不为7;
		2.数字的十位数不为5;
		3.数字的百位数不为3;
*/
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        if (num >= 100 && num < 1000) {
            for (int i = 100; i < num; i++) {
                if (i % 10 != 7 && i / 10 % 10 != 5 && i / 100 % 10 != 3) {
                    System.out.println(i);
                    count++;
                    sum += i;
                }
            }
            System.out.println("和为" + sum);
            System.out.println("个数为" + count + "个");
        } else {
            System.out.println("输入信息有误!");
        }
    }
}
