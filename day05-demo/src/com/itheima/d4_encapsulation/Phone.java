package com.itheima.d4_encapsulation;

public class Phone {
    private String name;
    private String color;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void show(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
    }
}
