package com.itheima.homework.test2;

public class ElectronicProduct extends Product {
    private String brand;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("商品名称:" + getName());
        System.out.println("商品价格:" + getPrice());
        System.out.println("商品品牌:" + getBrand());
    }
}
