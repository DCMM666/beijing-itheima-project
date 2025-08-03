package com.itheima.d5_do_while;

public class Test2 {
    public static void main(String[] args) {
        /*
            for  和  while 的区别
            for循环执行完毕后,初始化语句无法再次使用
            while循环执行完毕后,初始化语句可以继续使用

             如果有明确循环次数建议用 for 循环
             如果没有明确循环次数建议用 while 循环

             do-while循环: 至少执行一次循环体,基本不用!
         */
        double paper = 0.1;
        int count =0;
        do {
            paper *= 2;
            count++;
            System.out.println(paper);
        } while (paper < 8848860);
        System.out.println("一共要折叠"+count+"次");


    }
}
