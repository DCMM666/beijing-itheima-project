package com.itheima.homework.test3;

public abstract class ProductCategory {
    private String categoryName;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public abstract void calculateSales();

    public abstract void displayCategoryName();

}
