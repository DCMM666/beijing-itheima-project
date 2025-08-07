package com.itheima.homework.test3;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher th1 = new Teacher();
        th1.setName("杨");
        th1.setId("t001");
        th1.teach();
        Teacher th2 = new Teacher("李", "t002");
        th2.teach();
    }
}
