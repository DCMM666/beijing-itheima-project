package com.itheima.d3_operator;

/*
    目标：掌握扩展赋值运算符的使用
    基本的赋值运算符 : =
    扩展的赋值运算符 : += -= *= /= %=
 */
public class Test4 {
    public static void main(String[] args) {
        int a = 10;
        a += 10;
        System.out.println("a = " + a);
        String str = "abc";
        str += a;
        System.out.println("str = " + str);
        char ch = 'a';
        ch += a;
        System.out.println("ch = " + ch);

    }
}
