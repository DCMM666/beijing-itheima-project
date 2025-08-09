package com.itheima.homework.extend_test1;

/*
  需求1 : 编写一个父类Shape(形状)，包含一个名为area(面积)的方法，返回0。
  编写一个子类Rectangle(矩形)，重写area方法，计算矩形的面积并返回。
  测试类中创建一个Rectangle对象并调用area方法。
*/
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6.6, 5.5);
        double area = rectangle.area();
        System.out.println(area);
    }


}
