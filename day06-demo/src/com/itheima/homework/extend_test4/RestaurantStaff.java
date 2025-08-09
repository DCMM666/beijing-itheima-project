package com.itheima.homework.extend_test4;

public class RestaurantStaff {
    private String name;
    private int age;
    private String employeeId;
    private double salary;

    public RestaurantStaff() {
    }

    public RestaurantStaff(String name, int age, String employeeId, double salary) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        System.out.println("名字:" + name + "年龄:" + age + "工号:" + employeeId + "薪资" + salary);
        return salary;
    }
}
