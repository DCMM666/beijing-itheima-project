package com.itheima.homework.test5;

public class Computer {
    public static void use(USB usb) {
        usb.connect();
        if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.input();
        }
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        usb.exit();

    }
}
