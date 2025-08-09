package com.itheima.homework.extend_test8;

/*
    假设你是一名游戏开发者，需要设计一个游戏人物的类，游戏人物分为战士（Warrior）、法师（Wizard）和盗贼（Thief）三种类型。他们有一些共同的属性和方法，也有一些不同的属性和方法。

    请设计一个游戏人物的父类（Character）和三个子类（Warrior、Wizard、Thief），并实现以下功能：
        父类Character具有属性name、level（等级）、healthPoints（健康点）和manaPoints（魔法点），都为私有属性，并提供了对应的getter和setter方法。
        父类Character具有方法attack()，输出“使用普通攻击对敌人造成10点伤害”。
        子类Warrior具有属性weapon，表示使用的武器，为私有属性，并提供了对应的getter和setter方法。
        子类Warrior具有方法charge()，输出“使用冲锋技能对敌人造成20点伤害”。
        子类Wizard具有属性spell，表示使用的法术，为私有属性，并提供了对应的getter和setter方法。
        子类Wizard具有方法cast()，输出“使用法术对敌人造成30点伤害”。
        子类Thief具有属性stealth，表示潜行能力，为私有属性，并提供了对应的getter和setter方法。
        子类Thief具有方法sneak()，输出“使用潜行技能对敌人造成40点伤害”。
        所有子类继承自父类Character，并在子类中实现自己特有的属性和方法。
        在测试代码中创建一个战士、一个法师和一个盗贼，并调用他们的攻击方法和特有方法。
        */
public class Test {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("威尔", 5, 100, 60, "百夫长大剑");
        Wizard wizard = new Wizard("盖尔", 6, 75, 100, "艾嘉西斯之铠");
        Thief thief = new Thief("阿斯代伦", 5, 80, 70, "巧手");
        System.out.println(warrior.getName() + "使用" + warrior.getWeapon() + "战斗!");
        warrior.attack();
        warrior.charge();
        System.out.println(wizard.getName() + "使用" + wizard.getSpell() + "攻击");
        wizard.attack();
        wizard.cast();
        System.out.println(thief.getName() + "使用" + thief.getStealth() + "攻击");
        thief.attack();
        thief.sneak();

    }


}
