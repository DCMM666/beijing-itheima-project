package com.itheima.homework.test1;

public class Manager extends Employee {
    public Manager() {
    }

    public Manager(String workId, String name, double salary) {
        super(workId, name, salary);
    }


    @Override
    public void workMethod() {
        System.out.println("工号为:" + getWorkId() + "姓名为:" + getName() + ",工资为" + getSalary() + "的经理在工作:管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("工号为:" + getWorkId() + "姓名为:" + getName() + ",工资为" + getSalary() + "的经理在吃鱼");
    }
}
