package com.itheima.d3_extends_override;
/*
    方法重写的注意事项
        1. 私有的方法子类无法重写
        2. @Override : 注解 , 修饰方法,校验此方法是都属于重写的方法,如果不满足方法重写就会编译时期报错

        3. 扩展 : 子类重写父类的方法, 子类的方法返回值类型可以是父类的方法返回值类型的子类型 , 一般保持一致
        4. 扩展 : 权限修饰符 : public > protected > 默认 > private
           子类的方法权限修饰符必须大于等于父类方法的权限修饰符 , 一般保持一致!
 */
public class Test {
    public static void main(String[] args) {

        /*
            目标：掌握继承后方法重写的写法
            需求：旧手机只有打电话和发短信两个功能，现在的新手机除了支持基本的打电话功能外，还支持视频通话；
            发短信功能除了支持基本的发短信外，还支持发送图片。
         */
        Iphone ip = new Iphone();
        ip.call();
    }
}
