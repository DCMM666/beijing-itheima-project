package com.itheima.homework.test4;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setBrand("小米");
        phone1.setColor("黑色");
        phone1.setPrice(3998);
        phone1.call();
        phone1.sendMessage();
    }
}
