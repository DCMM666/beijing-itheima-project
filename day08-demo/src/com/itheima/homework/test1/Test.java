package com.itheima.homework.test1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询的年份:");
        int year = sc.nextInt();
        System.out.println("请输入要查询的月份:");
        String inputMonth = sc.next();
        Month month = Month.valueOf(inputMonth);
        checkMonth(month, year);
    }

    public static void checkMonth(Month month, int year) {
        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> System.out.println("31天");
            case FEBRUARY -> {
                boolean flag = checkYear(year);
                if (flag) {
                    System.out.println("29天");
                } else {
                    System.out.println("28天");
                }
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> System.out.println("30天");
            default -> System.out.println("输入错误");

        }
    }

    public static boolean checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

