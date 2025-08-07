package com.itheima.d5_constructor;

// 自己写的类 , 封装数据
public class Student {
    private String name;
    private int age;

    // 空参构造方法
    public Student(){

    }
    // 全参构造方法
    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    public void show(){
        System.out.println("姓名:" + this.name);
        System.out.println("年龄:" + this.age);
    }
}
