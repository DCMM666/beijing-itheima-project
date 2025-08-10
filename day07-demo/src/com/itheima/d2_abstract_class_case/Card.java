package com.itheima.d2_abstract_class_case;

public abstract class Card {
    private String name;
    private double balance;
    public abstract void pay(double money);

    public Card() {
    }

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    //goldCard
    //silverCard
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
