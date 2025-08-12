package com.itheima.test;

// 父类
public abstract class Father {
    private String name;
    private int age;
    private String gender;

    public Father() {
    }

    public Father(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 方法要么存在方法体 , 要么就是抽象方法
    public abstract void study();

}
