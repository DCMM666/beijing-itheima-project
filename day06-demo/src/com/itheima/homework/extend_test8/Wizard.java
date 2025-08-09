package com.itheima.homework.extend_test8;

public class Wizard extends Character {
    private String spell;

    public Wizard() {
    }

    public Wizard(String name, int level, int healthPoints, int manaPoints, String spell) {
        super(name, level, healthPoints, manaPoints);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public void cast() {
        System.out.println("使用法术对敌人造成30点伤害");
    }
}
