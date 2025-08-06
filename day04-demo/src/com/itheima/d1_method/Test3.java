package com.itheima.d1_method;

public class Test3 {
    public static void main(String[] args) {
        // 目标：掌握没有参数的方法和没有返回值的方法的定义和调用
        // 没有参数的方法
        //直接调用
        getSum();
        //赋值调用
        int sum = getSum();
        System.out.println(sum);
        //输出调用
        System.out.println(getSum());
        System.out.println("---------------");
        getEvenSum(100);


    }

    //无参有返回值
    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    //有参无返回
    public static void getEvenSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
