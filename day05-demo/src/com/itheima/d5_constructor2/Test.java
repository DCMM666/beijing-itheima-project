package com.itheima.d5_constructor2;

public class Test {
    public static void main(String[] args) {
        // 目标：理解定义和使用构造方法的注意事项
        Student stu = new Student();
        stu.setName("钟晨瑶");
        stu.setAge(21);
        stu.setGender("女");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getGender());
        Student stu2 =new Student("张杰",18,"男");
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(stu2.getGender());

    }
}
