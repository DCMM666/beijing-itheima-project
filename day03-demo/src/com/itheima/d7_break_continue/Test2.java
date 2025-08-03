package com.itheima.d7_break_continue;

/*
    continue 使用位置 : 只能在循环中使用
    continue 的作用 : 跳过本次循环进行下一次循环
 */
public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握continue跳转关键字的作用

        // 需求：小花狗吃包子，吃到第3个包子的时候，发现第三个包子里有个小石头，于是，第三个包子不吃了，但是第4个和第5个还是要吃的
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("小花狗吃完了" + i + "个包子");
        }
    }
}
