package com.itheima.homework.test1;

public class Cook extends Employee {
    public Cook() {
    }

    public Cook(String workId, String name, double salary) {
        super(workId, name, salary);
    }

    @Override
    public void workMethod() {
        System.out.println("工号为:" + getWorkId() + "姓名为:" + getName() + ",工资为" + getSalary() + "的厨师在炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为:" + getWorkId() + "姓名为:" + getName() + ",工资为" + getSalary() + "的厨师在吃肉");
    }
}
