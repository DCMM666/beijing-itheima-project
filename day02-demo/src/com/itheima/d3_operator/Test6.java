package com.itheima.d3_operator;

/*
    & : 逻辑与 , 有 false 则 false
    | : 逻辑或 , 有 true 则 true
    ! : 逻辑非 , 非 true 则 false  , 非 false 则 true
    ^ : 异或 , 相同为 false 不同为 true

    短路运算符
    && : 有 false 则 false , 具备短路 当左边为 false 右边不执行
    || : 有 true 则 true , 具备短路 当左边为 true 右边不执行

   常用  &&  ||  !
 */
public class Test6 {
    public static void main(String[] args) {


        // 目标：掌握逻辑运算符的使用和规则                                 &&
        // 1.逻辑与：&&，要求左右两边都为true，结果才为true            同true则true否则为false
        // 需求：买手机，要求屏幕尺寸在7英寸以上，机身内存在32GB及以下     有false则false       左边false右边不执行
        int size = 8;
        int ram = 32;
        System.out.println(size > 7 && --ram < 32);

        // 2.逻辑或：||，要求左右两边只要有一边为true，结果就是true            ||
        // 需求：买手机，要求屏幕尺寸在7英寸以上或者机身内存在32GB及以下       有true则true       左边true 则右边不执行
        System.out.println(size > 7 || ram++ < 32);
        System.out.println(ram);
        System.out.println(!(ram++ < 32));                       //!取反
        System.out.println("ram = " + ram);

        System.out.println(size > 7 ^ ram++ < 32); // true ^ false true

    }
}
