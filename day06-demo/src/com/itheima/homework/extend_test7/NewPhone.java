package com.itheima.homework.extend_test7;

public class NewPhone extends OldPhone {
    public NewPhone() {
    }

    public NewPhone(String brand, double price) {
        super(brand, price);
    }

    public void show() {
        System.out.println("品牌:" + super.getBrand() + "价格:" + super.getPrice());
    }

    @Override
    public void callDisplay() {
        System.out.println("显示头像");
        System.out.println("显示归属地");
        super.callDisplay();
    }

}
