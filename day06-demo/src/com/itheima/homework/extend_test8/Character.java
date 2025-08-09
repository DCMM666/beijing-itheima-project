package com.itheima.homework.extend_test8;

public class Character {
    private String name;
    private int level;
    private int healthPoints;
    private int manaPoints;

    public Character() {
    }

    public Character(String name, int level, int healthPoints, int manaPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", healthPoints=" + healthPoints +
                ", manaPoints=" + manaPoints +
                '}';
    }

    public void attack() {
        System.out.println("使用普通攻击对敌人造成10点伤害");
    }
}
