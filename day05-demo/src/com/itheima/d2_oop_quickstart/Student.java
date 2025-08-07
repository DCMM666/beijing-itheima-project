package com.itheima.d2_oop_quickstart;

public class Student {
    String name;
    int age;
    String gender;
    int math;
    int chinese;
    public int getaverag(){
        int sum =getSum();
        return sum/2;
    }
    public int getSum(){
        return (math+chinese);
    }
}
