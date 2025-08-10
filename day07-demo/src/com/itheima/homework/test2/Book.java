package com.itheima.homework.test2;

public class Book extends Product {
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("书籍名称:" + getName());
        System.out.println("书籍价格:" + getPrice());
        System.out.println("书籍作者:" + getAuthor());
    }
}
