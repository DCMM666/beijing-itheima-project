package com.itheima.d3_operator;

/*
    需求：任意给定一个三位数，例如：789，将其拆分为个位、十位、百位后，分别将结果打印在控制台

    控制台 :  789 的个位是 9 十位是 8 百位是 7

      个位 :   123%10=3           789%10=9
      十位 :   123/10%10=2        789/10%10=8
      百位 :   123/10/10%10=1     789/10/10%10=7
 */
public class Test2 {
    public static void main(String[] args) {
        int num = 123;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 10 / 10 % 10;
        System.out.println(num + "的个位是： " + ge + " 十位是： " + shi + " 百位是： " + bai);

    }
}
