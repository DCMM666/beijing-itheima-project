package com.itheima.homework.extend_test5;

public class Shape {

    private static final double PI = 3.1415926535;

    private Shape() {
    }

    public static double getCircleArea(double r) {
        return PI * Math.pow(r, 2);

    }

    public static double getRectangleArea(double length, double weight) {
        return length * weight;
    }

    public static double getTriangleArea(double base, double height) {
        return base * height / 2;

    }


}
