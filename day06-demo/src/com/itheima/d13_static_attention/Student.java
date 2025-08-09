package com.itheima.d13_static_attention;

public class Student {
    private String name ;
    private static String school;

    public void method1(){
        System.out.println(name);
        System.out.println(school);
        method2();
        method3();
    }
    public void method2(){
        System.out.println(this);

    }
    public static void method3(){
        System.out.println();
        System.out.println(school);
        method3();
        method4();

    }
    public static void method4(){
        //System.out.println(this);

    }
}
