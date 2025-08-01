package com.itheima.d1_data_type;

/*
    目标：掌握四大类八种基本数据类型的变量定义
      整型：byte short int long
      浮点型 float double
      字符型 char
      布尔类型 boolean
    变量的定义格式 :  数据类型  变量名 = 值;

    注意事项 :
        1. 整数的默认类型是 int
        2. 小数类型默认是 double 类型
        3. 定义 long 类型数据时,数据后需要加上 L 或者 l
        3. 定义 float 类型数据时,数据后需要加上 F 或者 f
 */
public class Test1 {
    public static void main(String[] args) {
        byte bt = 127;
        System.out.println("bt = " + bt);
        short st = 1000;
        System.out.println("st = " + st);
        int num = 10000;
        System.out.println("num = " + num);
        long num2 = 10000000000L;
        System.out.println("num2 = " + num2);
        float num3 = 12.12F;
        System.out.println("num3 = " + num3);
        double num4 = 1000.123;
        System.out.println("num4 = " + num4);
        char cr = 'A';
        System.out.println("cr = " + cr);
        boolean flag = false;
        System.out.println("flag = " + flag);
    }
}
