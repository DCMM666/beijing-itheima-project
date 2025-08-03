package com.itheima.homework;

/*
    定义一个整数变量代表点赞的数量。默认值是0，
    现在有三个用户分别对一个作品点赞，使用自增的知识点模拟点赞数量增长的过程，
    输出当前点赞的数量。隔了一段时间，有一个用户取消了点赞，
    使用自减的知识点模拟点赞减少的过程，输出当前点赞的数量。
*/
public class OperatorTest2 {
    public static void main(String[] args) {
        int count = 0;
        count++;
        count++;
        count++;
        System.out.println("当前点赞的人数为:" + count);
        count--;
        System.out.println("当前点赞的人数为:" + count);
    }
}
