package com.itheima.homework.test01;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("凤姐");
        gf1.setHeight(155.0);
        gf1.setWeight(130.0);
        System.out.println("我女朋友叫" + gf1.getName() + ",身高" + gf1.getHeight() + "厘米,体重" + gf1.getWeight() + "斤");
        GirlFriend gf2 = new GirlFriend("迪妮热巴", 175.0, 90.0);
        System.out.println("我女朋友叫" + gf2.getName() + ",身高" + gf2.getHeight() + "厘米,体重" + gf2.getWeight() + "斤");

    }
}
