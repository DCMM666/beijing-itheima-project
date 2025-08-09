package com.itheima.homework.extend_test3;

public class Manager extends Employee {
    private String department;

    public Manager() {
    }

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("部门:" + department);
    }
}
