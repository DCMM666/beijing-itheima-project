package com.itheima.d1_visibility_modifier1;

public class Animal {
    private static void privateMethod() {
        System.out.println("private修饰的方法执行了");
    }

    static void method() {
        System.out.println("缺省修饰的方法执行了");
    }

    protected static void protectedMethod() {
        System.out.println("protected修饰的方法执行了");
    }

    public static void publicMethod() {
        System.out.println("public修饰的方法执行了");
    }

    public static void main(String[] args) {
        // 本类中，所有权限修饰符修饰的成分都可以访问
        Animal.privateMethod();
        Animal.method();
        Animal.protectedMethod();
        Animal.publicMethod();
    }
}
