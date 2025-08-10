package com.itheima.homework.test1;

public abstract class Employee {
    private String workId;
    private String name;
    private double salary;

    public abstract void workMethod();

    public abstract void eat();

    public Employee() {
    }

    public Employee(String workId, String name, double salary) {
        this.workId = workId;
        this.name = name;
        this.salary = salary;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

