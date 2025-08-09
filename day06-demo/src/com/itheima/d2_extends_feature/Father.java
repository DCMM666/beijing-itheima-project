package com.itheima.d2_extends_feature;

class GrandFather{
    int age =110;
}

public class Father extends GrandFather {
    int age = 70;
    int grandFather = super.age;
}
class Son extends Father {
    int age = 50;
    public void show(){
        int age =20;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
        System.out.println(super.grandFather);
    }
}