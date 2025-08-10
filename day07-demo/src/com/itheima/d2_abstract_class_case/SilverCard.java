package com.itheima.d2_abstract_class_case;

public class SilverCard extends Card{
    public SilverCard() {
    }

    public SilverCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void pay(double money) {
        System.out.println(getName()+"消费了"+money+"元,优惠后需交"+money*0.85+"元,余额为:"+(getBalance()-money*0.85));
    }
}
