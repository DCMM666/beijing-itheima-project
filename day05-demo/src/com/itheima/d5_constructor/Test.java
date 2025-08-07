package com.itheima.d5_constructor;

/*
    给对象的属性赋值
        1. setXxx 方法    修改值
        2. 构造方法       初始化值

   构造方法定义的注意事项
    1. 构造方法没有返回值类型.连 void 都没有
    2. 构造方法的名字必须和类名保持一致
    3. 构造方法不能通过对象调用 , 创建对象时 new 关键字后面就是调用构造方法
    4. 一个类没有给出任何构造方法,那么会存在一个默认的空参构造方法
    5. 如果我们自己给出了构造方法,默认存在空参将不再提供了

    构造方法的作用: 给对象进行初始化值
        空参构造 : 给对象初始化默认值
        有参构造 :
 */
public class Test {
    public static void main(String[] args) {
        // 目标：掌握构造方法的定义和使用

        // 创建对象1 : 空参构造 + set 方法赋值
        Student s = new Student();
        s.setName("柳岩");
        s.setAge(18);
        s.show();

        System.out.println("--------------------");

        // 创建对象2 : 全参构造方法
        Student s2 = new Student("柳岩2" , 20);
        s2.setAge(21);
        s2.show();

    }
}
