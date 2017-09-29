package com.lee;

/**
 * Created by Do My Duyen on 9/20/2017.
 */
public class Zoo {

    public static void main(String[] args) {
        Animal animal1 = new Animal(10, "Male", 4.5, "Tim");
        Animal animal2 = new Animal(9, "Female", 4.0, "John");
        Animal animal3 = new Animal(8, "Male", 5.5, "Brush");
        animal1.eat();
        animal2.sleep();
        animal3.eat();

        Bird vanhkhuyen = new Bird(4, "Male", 3.0, "Vu Le");
        vanhkhuyen.fly();
        Fish cavang = new Fish(5, "Female", 2.5, "Thien Le");
        cavang.swim();
    }
}
