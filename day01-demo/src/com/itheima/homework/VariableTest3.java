package com.itheima.homework;

/*定义一个变量代表商品的价格。商品一开始价格是300块钱。
在控制台输出商品的初始价格。为了迎接双十一，商品的价格先升价233.50元，输出升价之后的价格。
到了双十一，再降价200块，输出降价之后的价格。使用程序表示价格变化。*/
public class VariableTest3 {
    public static void main(String[] args) {
        double price = 300.00;
        System.out.println(price);
        price = price + 233.50;
        System.out.println(price);
        price = price - 200;
        System.out.println(price);
    }
}
