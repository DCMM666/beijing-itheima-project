package com.itheima.homework.test2;

public class Test {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("笔记本电脑", 6999.9, "联想");
        Book book = new Book("西游记", 49.9, "吴承恩");
        Mall.displayProductInfo(electronicProduct);
        System.out.println("----------------");
        Mall.displayProductInfo(book);
    }
}
