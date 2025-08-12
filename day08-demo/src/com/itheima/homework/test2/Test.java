package com.itheima.homework.test2;

public class Test {
    public static void main(String[] args) {
        Logger infoLogger = new Logger() {
            @Override
            public void log(String message) {
                System.out.println("[INFO]" + message);
            }
        };

        Logger warningLogger = new Logger() {
            @Override
            public void log(String message) {
                System.out.println("[INFO]" + message);
            }
        };
        Logger errorLogger = new Logger() {
            @Override
            public void log(String message) {
                System.out.println("[ERROR]" + message);
            }
        };

//        Logger infoLogger = (message) -> {
//            System.out.println("[INFO]" + message);
//        };
//        Logger warningLogger = (message)->{
//            System.out.println("[WARNING]"+message);
//        };
//        Logger errorLogger = (message) -> {
//            System.out.println("[ERROR]" + message);
//        };
        infoLogger.log("这是一条info级别的日志");
        warningLogger.log("这是一条warning级别的日志");
        errorLogger.log("这是一条error级别的日志");
    }
}
