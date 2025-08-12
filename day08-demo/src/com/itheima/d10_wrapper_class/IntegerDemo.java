package com.itheima.d10_wrapper_class;

public class IntegerDemo {
    public static void main(String[] args) {
        //int -----> String
        Integer i = 110;
        String str = String.valueOf(i);
        System.out.println(str);
        //double ------->String
        double d =12.12;
        Double d1 = d  ;
        String str2 = String.valueOf(d);
        System.out.println(str2);
        //String -----> int
        String str3 = "110";
        int num1 = Integer.parseInt(str3);
        System.out.println(num1);
        //String --------> double
        String str4 = "12.12";
        double d2 = Double.parseDouble(str4);
        System.out.println(d2);
        //String ------>boolean
        String str5 = "true";
        boolean flag = Boolean.parseBoolean(str5);
        System.out.println(flag);
    }
}
