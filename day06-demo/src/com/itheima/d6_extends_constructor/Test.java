package com.itheima.d6_extends_constructor;

// 测试类
public class Test {
    public static void main(String[] args) {
        // 目标：理解子类构造器调用父类有参数构造器的实际应用场景
        Student stu = new Student("柳岩",18);
        Student stu2 = new Student("柳岩",18);
        System.out.println(stu);
        System.out.println(stu2);
        System.out.println(stu.equals(stu2));

    }
}
