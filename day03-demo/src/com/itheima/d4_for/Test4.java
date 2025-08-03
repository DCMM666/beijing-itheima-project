package com.itheima.d4_for;

public class Test4 {
    public static void main(String[] args) {
        // 需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，假如我有一张足够大的纸，它的厚度是0.1毫米。
        // 请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
        int count = 0;
        /*double paper = 0.1;
        for (int i = 0; ; i++) {
            paper *= 2;
            count++;
            System.out.println(paper);
            if (paper > 8848860) {
                break;
            }
        }*/
        for (double paper = 0.1;paper < 8848860;paper *= 2){
            count++;
        }
        System.out.println("折叠的次数" + count);
    }
}
