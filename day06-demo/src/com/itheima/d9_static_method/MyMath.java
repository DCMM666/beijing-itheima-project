package com.itheima.d9_static_method;

public class MyMath {
    private MyMath() {
    }

    public static int getMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

}
