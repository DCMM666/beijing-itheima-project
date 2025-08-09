package com.itheima.homework.extend_test2;

public class Student extends Person {
    private String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void study() {
        show();
        System.out.println(school + "学习");
    }
}
