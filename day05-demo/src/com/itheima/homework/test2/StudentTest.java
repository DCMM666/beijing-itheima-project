package com.itheima.homework.test2;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.show();
        Student stu2 = new Student("李四", 24);
        stu2.show();
    }
}
