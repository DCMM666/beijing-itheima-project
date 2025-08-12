package com.itheima.test;

public class Teacher extends Father{
    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void study() {
        System.out.println("老师备课");
    }
}
