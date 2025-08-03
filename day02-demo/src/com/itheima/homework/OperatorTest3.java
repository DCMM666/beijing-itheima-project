package com.itheima.homework;

/*
    模拟用户在某东上搜索手机信息：
    用户想搜索一台价格是在4000到6000之间的手机，
    现在有一台手机，价格是5000块，使用程序输出当前手机是否符合用户的要求
*/
public class OperatorTest3 {
    public static void main(String[] args) {
        double price = 5000;
        System.out.println("当前手机的价格是否符合用户要求:" + (price >= 4000 && price <= 6000));
    }
}
