package com.itheima.homework.extend_test5;

/*
设计一个图形类，名为"Shape"，该类具有以下属性和方法：
    成员变量：
	    PI（圆周率，静态成员变量、常量）
    成员方法：
        求圆的面积方法（静态成员方法）
        求矩形的面积方法（静态成员方法）
        求三角形的面积方法（静态成员方法）
    要求：
         PI为静态成员变量，表示圆周率，使用static修饰。
        求圆、矩形、三角形的面积方法为静态成员方法，可以直接通过类名调用。
        求圆的面积方法接受一个double类型的参数表示半径。
        求矩形的面积方法接受两个double类型的参数分别表示长和宽。
        求三角形的面积方法接受两个double类型的参数分别表示底和高。
*/
public class Test {
    public static void main(String[] args) {
        double circleArea = Shape.getCircleArea(3);
        double rectangleArea = Shape.getRectangleArea(5.0, 3.0);
        double triangleArea = Shape.getTriangleArea(12.0, 5);
        System.out.println("圆形的面积为:" + circleArea);
        System.out.println("矩形的面积为:" + rectangleArea);
        System.out.println("三角形面积为:" + triangleArea);
    }
}
