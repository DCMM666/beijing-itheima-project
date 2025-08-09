package com.itheima.homework.extend_test1;

public class Rectangle extends Shape {
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }
}
