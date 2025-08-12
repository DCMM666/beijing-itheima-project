package com.itheima.homework.test3;

public class Test {
    public static void main(String[] args) {
        MessagePrinter.printMessage(new Message() {
            @Override
            public String getMessage() {
                return "Hello,world";
            }
        });
        //MessagePrinter.printMessage(() -> "Hello,world");
    }
}
