package com.itheima.d3_operator;
/*
    目标：掌握自增自减运算符的写法和作用
    单独使用 : ++ --用在变量的前面或后面，作用是对变量里的值加1或者减1
 */
public class Test3 {
    public static void main(String[] args) {
        int num1 =10;
        num1++;
        System.out.println("num1 = " + num1);

        int num=10;//12
        int num2 =num++ + ++num +num++ +num--;
                  //10+12+12+13
        System.out.println(num2);




        /*
            参与操作 :   ++ --放到变量前后的区别
                ++--出现在变量后（先看到变量），先使用变量，再对变量里的值自增自减
                ++--出现在变量前（先看到++--），先对变量里的值自增自减，再使用变量
         */

    }
}
