package com.itheima.d8_interface_test;

public class Test {
    public static void main(String[] args) {
        /*
            需求：请设计一个班级学生的信息管理模块：学生的数据有：姓名、性别、成绩
                功能1：要求打印出全班学生的信息；功能2：要求打印出全班学生的平均成绩。
                注意！以上功能的业务实现是有多套方案的，比如：
                第1套方案：能打印出班级全部学生的信息；能打印班级全部学生的平均分。
                第2套方案：能打印出班级全部学生的信息（包含男女人数）；能打印班级全部学生的平均分（要求去掉最高分、最低分）。
                要求：系统可以支持灵活的切换这些实现方案。
       */
        Student stu1 = new Student("杨幂", "女", 98);
        Student stu2 = new Student("王俊凯", "男", 94);
        Student stu3 = new Student("杨紫", "女", 95);
        Student stu4 = new Student("吴亦凡", "男", 78);
        Student stu5 = new Student("赵丽颖", "女", 92);
        Student stu6 = new Student("鹿晗", "男", 85);
        Student stu7 = new Student("迪丽热巴", "女", 90);
        Student stu8 = new Student("陈伟霆", "男", 88);
        Student stu9 = new Student("关晓彤", "女", 86);
        Student stu10 = new Student("黄子韬", "男", 82);
        Student[] students = {stu1, stu2, stu3, stu4, stu5, stu6, stu7, stu8, stu9, stu10};
        StudentManager implA = new StudentManageImplA();
        implA.printAllStudentInfo(students);
        implA.printStudentAvgScore(students);
        StudentManager implB = new StudentManageImplB();
        implB.printAllStudentInfo(students);
        implB.printStudentAvgScore(students);
    }
}
