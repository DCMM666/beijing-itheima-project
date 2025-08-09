package com.itheima.homework.extend_test7;

/*
    每一款手机都有自己的品牌和价格,原来的手机只能打电话,发短信,来电显示只能显示手机号;
    现在的新手机针对于来电显示做了功能的升级,还能显示头像,还能显示归属地,请设计程序,完成手机的升级!
 */
public class Test {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone("三星", 9999);
        newPhone.show();
        newPhone.call("柳岩");
        newPhone.sendMessage();
        newPhone.callDisplay();
    }
}
