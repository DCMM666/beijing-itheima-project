package com.itheima.homework.extend_test4;

public class Chef extends RestaurantStaff {
    private int numberOfDishes;

    public Chef() {
    }

    public Chef(String name, int age, String employeeId, double salary, int numberOfDishes) {
        super(name, age, employeeId, salary);
        this.numberOfDishes = numberOfDishes;
    }

    public int getNumberOfDishes() {
        return numberOfDishes;
    }

    public void setNumberOfDishes(int numberOfDishes) {
        this.numberOfDishes = numberOfDishes;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        double result = salary + numberOfDishes * 20;
        return result;
    }
}
