package com.itheima.homework.extend_test8;

public class Thief extends Character {
    private String stealth;

    public Thief() {
    }

    public Thief(String name, int level, int healthPoints, int manaPoints, String stealth) {
        super(name, level, healthPoints, manaPoints);
        this.stealth = stealth;
    }

    public String getStealth() {
        return stealth;
    }

    public void setStealth(String stealth) {
        this.stealth = stealth;
    }

    public void sneak() {
        System.out.println("使用潜行技能对敌人造成40点伤害");
    }
}
