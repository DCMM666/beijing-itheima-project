package com.itheima.d3_extends_override;

public class Phone {
    public void call(){
        System.out.println("打电话");
    }
}
class Iphone extends Phone{
    @Override
    public void call() {
        System.out.println("打开视频");
        super.call();
    }
}
