package com.itheima.d4_polymorphism_advantage;

import com.itheima.d2_abstract_class_case.Card;

public class Test {
    public static void main(String[] args) {
        useAnimal(new Dog());
        useAnimal(new Cat());
        useAnimal(new Pig());

    }
    public static void useAnimal(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.lookDoor();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }else {
            Pig pig = (Pig)animal;
            pig.sleep();
        }
    }

}
