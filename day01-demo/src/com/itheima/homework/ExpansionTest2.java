package com.itheima.homework;

/*模拟输出网站中手机的信息。手机的品牌：小米，商品介绍：小米13 徕卡光学镜头 第二代骁龙8处理器，评论数：100000，商家信息:小米京东自营旗舰店。要求，把上述手机的信息：品牌、商品介绍、评论数、商家信息用变量定义，进行存储，并且打印手机的信息
tips: 可以使用下面的名称
品牌 :  brand
商品介绍 : desc
评论数 : count
商家信息 : store*/
public class ExpansionTest2 {
    public static void main(String[] args) {
        String brand = "小米";
        String desc = "小米13 徕卡光学镜头 第二代骁龙8处理器";
        int count = 100000;
        String store = "小米京东自营旗舰店";
        System.out.println("------手机信息-------");
        System.out.println("手机的品牌：" + brand);
        System.out.println("商品介绍：" + desc);
        System.out.println("评论数：" + count);
        System.out.println("商品信息：" + store);
    }
}
