package com.itheima.d3_while;

public class Test2 {
    public static void main(String[] args) {
        // 需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，假如我有一张足够大的纸，它的厚度是0.1毫米。
        // 请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
       double height =0.1;
       int count = 0 ;
       while (height<8848860){
           height *=2;
           count++;
           System.out.println("折叠次数为"+count+"次,当前高度为"+height+"毫米");
       }
    }
}
