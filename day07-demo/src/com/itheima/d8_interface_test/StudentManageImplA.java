package com.itheima.d8_interface_test;

public class StudentManageImplA implements StudentManager{
    //打印所有学生信息
    @Override
    public void printAllStudentInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("学生姓名:"+s.getName());
            System.out.println("学生性别:"+s.getGender());
            System.out.println("学生成绩:"+s.getScore());
            System.out.println();
        }
    }
    //求学生平均成绩
    @Override
    public void printStudentAvgScore(Student[] students) {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("学生的平均成绩为:"+(sum/students.length));
    }
}
