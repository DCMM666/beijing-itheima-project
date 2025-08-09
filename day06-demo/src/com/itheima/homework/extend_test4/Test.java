package com.itheima.homework.extend_test4;

/*
    需求4 :
    1. 创建一个餐厅员工类（RestaurantStaff），包含以下属性：姓名（name）、年龄（age）、工号（employeeId）、工资（salary）。餐厅员工类有一个方法：计算工资。
    2. 创建一个服务员类（Waiter），继承自餐厅员工类。服务员类有一个额外属性：每月接待的客人数量（numberOfCustomers），并且重写了计算工资的方法，计算方法为基本工资加上每接待一个客人的奖金。
    3. 创建一个厨师类（Chef），继承自餐厅员工类。厨师类有一个额外属性：每月烹饪的菜品数量（numberOfDishes），并且重写了计算工资的方法，计算方法为基本工资加上每烹饪一道菜品的奖金。
    4. 创建一个程序，在程序中创建一个服务员对象和一个厨师对象，并输出他们的工资。
 */
public class Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("张三", 25, "21001", 5000, 50);
        double waiterSalary = waiter.calculateSalary();
        System.out.println("最终薪资为:" + waiterSalary);
        Chef chef = new Chef("李四", 26, "21002", 10000.0, 20);
        double chefSalary = chef.calculateSalary();
        System.out.println("最终薪资为:" + chefSalary);
    }
}
