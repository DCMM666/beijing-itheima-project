package com.itheima.d8_interface_test;

public interface StudentManager {
    //打印所有学生信息
    public abstract void printAllStudentInfo(Student[] students);
    //打印学生平均成绩
    public abstract void printStudentAvgScore(Student[] students);
}
