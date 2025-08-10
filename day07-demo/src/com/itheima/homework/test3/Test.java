package com.itheima.homework.test3;

public class Test {
    public static void main(String[] args) {
        ClothingCategory clothingCategory = new ClothingCategory("鸿星尔克短袖", 50);
        ElectronicsCategory electronicsCategory = new ElectronicsCategory("海尔洗衣机", 15);
        clothingCategory.displayCategoryName();
        clothingCategory.calculateSales();
        electronicsCategory.displayCategoryName();
        electronicsCategory.calculateSales();

    }
}
