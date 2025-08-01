package com.itheima.d2_type_convert;

    /*
          目标：掌握表达式的自动类型提升规则
          byte,short,char --> int --> long --> float --> double

          1.byte/short/char都是先提升为int，再运算
          2.表达式的结果类型由表达式中的最高类型决定
    */
public class Test2 {
    public static void main(String[] args) {


        // 需求 : 定义一个 short 类型变量 , 定义一个 char 类型的变量 , 做加法运算符, 问使用什么类型接收? int
        short num1=10;
        char cr=20;
        int num2= num1+cr;
        System.out.println("num2 = " + num2);
    }
}
