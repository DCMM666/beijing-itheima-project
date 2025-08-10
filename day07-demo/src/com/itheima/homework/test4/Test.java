package com.itheima.homework.test4;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("斯派克", 60);
        Animal cat = new Cat("汤姆", 10);
        useAnimal(dog);
        System.out.println("-------------");
        useAnimal(cat);
    }

    public static void useAnimal(Animal animal) {
        animal.eat();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.lookHome();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
