package com.itheima.test;

public class MessagePrinter {
    private MessagePrinter(){}

    public static void printMessage(Message message){
        String s = message.getMessage();
        System.out.println(s);
    }
}


interface Message{
    public abstract String getMessage();
}

class Test2{
    public static void main(String[] args) {
        MessagePrinter.printMessage(new Message() {
            @Override
            public String getMessage() {
                return "abc";
            }
        });
    }
}