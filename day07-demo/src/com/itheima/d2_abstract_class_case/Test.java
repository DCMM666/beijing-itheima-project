package com.itheima.d2_abstract_class_case;

public class Test {
    public static void main(String[] args) {
        /*
            需求：
                某加油站推出了2种支付卡，一种是预存10000的金卡，后续加油享受8折优惠，另一种是预存5000的银卡，后续加油享受8.5折优惠。
                请分别实现2种卡片进入收银系统后的逻辑，卡片需要包含主人名称，余额，支付功能。
         */
        SilverCard silverCard = new SilverCard("钟晨瑶",5000);
        silverCard.pay(1000);

    }
}
