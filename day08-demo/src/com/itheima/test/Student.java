package com.itheima.test;

// 子类
public class Student extends Father{
    public Student() {
    }

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void study() {
        System.out.println("学生学习....");
    }
}
