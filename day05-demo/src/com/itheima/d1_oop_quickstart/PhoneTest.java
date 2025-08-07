package com.itheima.d1_oop_quickstart;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.color = "white";
        phone.price = 6999;
        phone.call("钟晨瑶");
        phone.music();
        phone.video();
        phone.show();
        Phone phone1 = new Phone();
        phone1.brand = "三星";
        phone1.color = "black";
        phone1.price = 7999;
        phone.call("钟晨瑶");
        phone.music();
        phone.video();
        phone1.show();
    }


}
