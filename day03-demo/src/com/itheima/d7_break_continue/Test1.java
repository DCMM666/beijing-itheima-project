package com.itheima.d7_break_continue;

/*
    break使用位置 : switch 或者 循环中
    break的作用   : 用来结束 switch 或者循环
 */
public class Test1 {
    public static void main(String[] args) {
        // 目标：掌握break跳转关键字的作用

        // 需求：小花狗吃包子，一共有5个包子，小花狗吃完了3个包子发现饱了，后面2个包子都不吃了
        for (int i = 1; i <= 5; i++) {
            System.out.println("小花狗吃完了" + i + "个包子");
            if (i == 3) {
                break;
            }
        }

    }
}
