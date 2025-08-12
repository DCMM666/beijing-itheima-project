package com.itheima.homework.test3;
//工具栏
public class MessagePrinter {
    private MessagePrinter() {
    }
    public static void printMessage(Message messageImpl){
        System.out.println(messageImpl.getMessage());
    }
}
