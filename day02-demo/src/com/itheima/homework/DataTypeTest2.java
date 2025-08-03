package com.itheima.homework;
/*
    要存储一个学员的姓名(杨密)、性别(女)、年龄(22)、分数(88.5)，
    请选择对应的类型去定义变量，把这些信息定义为变量
    tips: 可以使用下面的名称
  	姓名: name
    性别: gender
    年龄: age
    分数: score
*/
public class DataTypeTest2 {
    public static void main(String[] args) {
        String name = "杨密";
        char gender = '女';
        int age = 22;
        double score = 88.5;
        System.out.println("--------学生信息---------");
        System.out.println("姓名:" + name);
        System.out.println("性别:" + gender);
        System.out.println("年龄:" + age);
        System.out.println("分数:" + score);
    }
}
