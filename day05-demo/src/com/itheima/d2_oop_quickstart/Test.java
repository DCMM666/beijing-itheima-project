package com.itheima.d2_oop_quickstart;

// 测试类 - 带有 main 方法的类
public class Test {
    public static void main(String[] args) {
        // 需求：请用面向对象编程的方式，存储两个学生的信息，并要求打印出每个学生的总成绩和平均成绩
        Student stu = new Student();
        stu.name="李四";
        stu.age=18;
        stu.gender="男";
        stu.math=70;
        stu.chinese=60;
        int sum = stu.getSum();
        int averag = stu.getaverag();
        System.out.println(stu.name+"总成绩为:"+sum+"平均分为:"+averag);


    }
}
