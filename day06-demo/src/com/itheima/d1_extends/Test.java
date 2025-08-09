package com.itheima.d1_extends;

public class Test {
    public static void main(String[] args) {
        // 目标：认识继承，理解继承的作用
        /*
            继承是两个类通过extends关键字建立起的一种父子关系
            子类继承父类后，可以直接使用父类中所有非私有的属性和方法
         */
        //学生类空参构造
        Student stu = new Student();
        stu.setName("钟晨瑶");
        stu.setAge(20);
        stu.setStudentId("heima001");

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getStudentId());
        stu.study();
        //学生类全参构造
        Student stu2 = new Student("柳岩", 18, "heima002");
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(stu2.getStudentId());
        stu2.study();
        //教师类无参构造
        Teacher th = new Teacher();
        th.setName("杨老师");
        th.setAge(25);
        th.setWordId("hm001");
        System.out.println(th.getName());
        System.out.println(th.getAge());
        System.out.println(th.getWordId());
        th.teach();
        //教师类全参构造
        Teacher th2 = new Teacher("李老师", 25, "hm002");
        System.out.println(th2.getName());
        System.out.println(th2.getAge());
        System.out.println(th2.getWordId());
        th2.teach();

    }
}
