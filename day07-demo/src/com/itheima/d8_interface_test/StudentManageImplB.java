package com.itheima.d8_interface_test;

public class StudentManageImplB implements StudentManager {
    //打印所有的学生信息 与男生女生的人数
    @Override
    public void printAllStudentInfo(Student[] students) {
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("学生姓名:" + s.getName());
            System.out.println("学生性别:" + s.getGender());
            System.out.println("学生成绩:" + s.getScore());
            System.out.println();
            if (s.getGender().equals("男")) {
                boyCount++;
            } else {
                girlCount++;
            }
        }
        System.out.println("男生人数:" + boyCount + ",女生人数:" + girlCount);

    }

    //去掉最高最低分求平均分
    @Override
    public void printStudentAvgScore(Student[] students) {
        double sum = 0;
        double max = students[0].getScore();
        double min = students[0].getScore();
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if (s.getScore() > max) {
                max = s.getScore();
            }
            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("学生的平均成绩为:" + ((sum - max - min) / (students.length - 2)));
    }
}
