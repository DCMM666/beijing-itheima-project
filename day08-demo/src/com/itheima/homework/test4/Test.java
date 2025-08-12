package com.itheima.homework.test4;

public class Test {
    public static void main(String[] args) {
        fun(new JumpAble() {
            @Override
            public void jump() {
                System.out.println("匿名内部类");
            }
        });
        fun(() -> {
            System.out.println("lambda表达式完整格式");
        });
        fun(() -> System.out.println("lambda表达式简化格式"));
    }

    public static void fun(JumpAble jumpAbleImpl) {
        jumpAbleImpl.jump();
    }
}
