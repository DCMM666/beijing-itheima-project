package com.itheima.homework;

/*需求:
	1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
    2.最后要打印符合条件的数字的总数量
   	3.打印格式如下:
		1010
        1021
        1032
        1043
        ....
        以上满足条件的四位数总共有 615 个
*/
public class Test5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (i % 10 + (i / 1000 % 10) == i / 100 % 10 + (i / 10 % 10)) {
                System.out.print(i+" ");
                count++;
                if (count%5==0){
                    System.out.println();
                }

            }


        }
        System.out.println("满足条件的有" + count + "个");
    }
}
