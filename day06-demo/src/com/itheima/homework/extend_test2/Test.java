package com.itheima.homework.extend_test2;

/*
需求2 :
    1. 创建一个名为Person的父类，包含以下成员变量和方法：
   - 成员变量：name（String类型）、age（int类型）
   - 构造方法：一个无参 , 一个带参数的构造方法，用于初始化name和age
   - 方法：一个名为show方法，用于打印出姓名和年龄。

    2. 创建一个名为Student的子类，继承自Person类，包含以下成员变量和方法：
   - 成员变量：school（Str先`ing类型）
   - 构造方法：一个带参数的构造方法，用于初始化name、age和school
   - 方法：一个名为study的方法，用于打印出学习的信息。

    3. 创建一个名为Teacher的子类，继承自Person类，包含以下成员变量和方法：
   - 成员变量：subject（String类型）
   - 构造方法：一个带参数的构造方法，用于初始化name、age和subject
   - 方法：一个名为teach的方法，用于打印出教授的信息。

    4. 在一个名为Main的类中，创建一个Student对象和一个Teacher对象，并调用它们的成员方法，观察输出结果。
*/
public class Test {
    public static void main(String[] args) {
        Student stu = new Student("柳岩", 25, "传智教育");
        stu.study();
        Teacher th = new Teacher("杨老师", 27, "java");
        th.teach();
    }
}
