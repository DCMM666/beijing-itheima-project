package com.itheima.homework.extend_test4;

public class Waiter extends RestaurantStaff {
    private int numberOfCustomers;

    public Waiter() {
    }

    public Waiter(String name, int age, String employeeId, double salary, int numberOfCustomers) {
        super(name, age, employeeId, salary);
        this.numberOfCustomers = numberOfCustomers;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        double result = salary + numberOfCustomers * 10;
        return result;
    }
}
