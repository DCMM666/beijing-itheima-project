package com.itheima.homework;

/*
现在模拟学生信息记录。已知学生的学号：A20330303，姓名：易秀，年龄是23岁，身高：173.5，居住地：广州市天河区珠吉公路上街4号。要求：把上述学生的信息：学号、年龄、身高、居住地用变量定义，进行存储，并且打印学生的信息
tips: 可以使用下面的名称
学号 : id
姓名 : name
年龄 : age
身高 : height
居住地 : address
*/
public class ExpansionTest1 {
    public static void main(String[] args) {
        String id = "A20330303";
        String name = "易秀";
        int age = 23;
        double height = 173.5;
        String address = "广州市天河区珠吉公路上街4号";
        System.out.println("------学员信息展示-------");
        System.out.println("学号：" + id);
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height);
        System.out.println("居住地：" + address);


    }
}
