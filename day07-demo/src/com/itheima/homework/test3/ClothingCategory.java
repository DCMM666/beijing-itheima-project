package com.itheima.homework.test3;

public class ClothingCategory extends ProductCategory {
    private int clothingCount;

    public ClothingCategory() {
    }

    public ClothingCategory(String categoryName, int clothingCount) {
        super(categoryName);
        this.clothingCount = clothingCount;
    }

    public int getClothingCount() {
        return clothingCount;
    }

    public void setClothingCount(int clothingCount) {
        this.clothingCount = clothingCount;
    }

    @Override
    public void calculateSales() {
        System.out.println("服装销售额:" + getClothingCount() * 100);
    }

    @Override
    public void displayCategoryName() {
        System.out.println("服装名称:" + getCategoryName());
    }
}
