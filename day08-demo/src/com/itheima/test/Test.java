package com.itheima.test;
// 测试类 : 带有 main 方法
public class Test {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("柳岩");
//        s.setAge(18);
//        s.setGender("女");

        Student s = new Student("ly" , 18 , "女");

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());

        show(new Student());
        show(new Teacher());

        show2(new AImpl1());
        show2(new AImpl2());
        show2(new AImpl3());

//        父类型 变量 = new 子类();
//        接口类型 变量 = new 实现类();

    }

    /*
        方法的参数是一个类 , 那么调用此方法需要传入此类的对象或者此类的子类对象
     */
    public static void show(Father father){

    }

    /*
       方法的参数是一个接口 , 那么调用此方法需要传入此接口的实现类对象
     */
    public static void show2(A a){ // A a = new AImpl3()

    }
}

interface A{

}

class AImpl1 implements A{

}


class AImpl2 implements A{

}

class AImpl3 implements A{

}