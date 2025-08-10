package com.itheima.homework.test3;

public class ElectronicsCategory extends ProductCategory {
    private int electronicsCount;

    public ElectronicsCategory() {
    }

    public ElectronicsCategory(String categoryName, int electronicsCount) {
        super(categoryName);
        this.electronicsCount = electronicsCount;
    }

    public int getElectronicsCount() {
        return electronicsCount;
    }

    public void setElectronicsCount(int electronicsCount) {
        this.electronicsCount = electronicsCount;
    }

    @Override
    public void calculateSales() {
        System.out.println("家电销售额:" + electronicsCount * 500);
    }

    @Override
    public void displayCategoryName() {
        System.out.println("家电名称:" + getCategoryName());
    }
}
