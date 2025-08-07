package com.itheima.d7_oop_demo;

public class Movie {
    private int id ;
    private String name;
    private double score;
    private double price;
    private String actor;

    public Movie() {
    }

    public Movie(int id, String name, double score, double price, String actor) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.price = price;
        this.actor = actor;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return actor
     */
    public String getActor() {
        return actor;
    }

    /**
     * 设置
     * @param actor
     */
    public void setActor(String actor) {
        this.actor = actor;
    }

    public String toString() {
        return "Movie{id = " + id + ", name = " + name + ", score = " + score + ", price = " + price + ", actor = " + actor + "}";
    }
}
