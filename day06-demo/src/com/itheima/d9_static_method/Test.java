package com.itheima.d9_static_method;

public class Test {
    public static void main(String[] args) {
        // 目标：理解static修饰成员方法的使用场景
        // 当类中的方法执行逻辑和数据都和当前类的对象无关的时候，就可以用static修饰这个方法了
        int max = MyMath.getMax(-100, -200);
        System.out.println("max = " + max);
    }
}
