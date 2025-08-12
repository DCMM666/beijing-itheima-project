package com.itheima.d8_anonymous_inner_class;

public class Test {
    public static void main(String[] args) {
//        SwimImpl swim = new SwimImpl();
//        swim.swim();
        //匿名内部类不需要创建实现类对象
         Swimming(new Swim() {
             @Override
             public void swim() {
                 System.out.println("匿名内部类游泳");
             }
         });
    }
    public static void Swimming(Swim swim){
        swim.swim();
    }
}

