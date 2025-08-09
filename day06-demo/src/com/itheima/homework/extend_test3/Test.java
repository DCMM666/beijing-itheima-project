package com.itheima.homework.extend_test3;

/*
 需求 3
    1. 创建一个名为Employee的父类，具有以下属性和方法：
   - 属性：name（员工的姓名），salary（员工的薪水）
   - 方法：calculateSalary()（计算员工的薪水）
    2. 创建一个名为Manager的子类，继承自Employee类，具有以下属性和方法：
   - 属性：department（经理所在的部门）
   - 方法：calculateSalary()（重写父类的calculateSalary()方法）
    3. 在Manager类的构造方法中使用super关键字调用父类Employee的构造方法，初始化name和salary属性。
    4. 在Manager类中重写父类Employee的calculateSalary()方法，计算经理的薪水，并调用父类的calculateSalary()方法
*/
public class Test {
    public static void main(String[] args) {
        Manager mg = new Manager("杨幂", 6999, "教研部");
        mg.calculateSalary();
    }
}
