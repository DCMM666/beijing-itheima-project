package com.itheima.d4_encapsulation;

import java.sql.SQLOutput;

public class PhoneTest {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.setName("华为");
        iphone.setColor("white");
        iphone.setPrice(5999);

        System.out.println(iphone.getName());
        System.out.println(iphone.getColor());
        System.out.println(iphone.getPrice());
    }


}
