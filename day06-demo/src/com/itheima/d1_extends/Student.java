package com.itheima.d1_extends;

public class Student extends People {
    private String studentId;

    public Student() {
    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study() {
        System.out.println("学习");
    }

}
