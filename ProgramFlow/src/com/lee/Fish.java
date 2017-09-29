package com.lee;

/**
 * Created by Do My Duyen on 9/20/2017.
 */
public class Fish extends Animal {

    public Fish(int age, String gender, double pound) {
        super(age, gender, pound);
    }

    public Fish(int age, String gender, double pound, String name) {
        super(age, gender, pound, name);
    }

    public void swim() {
        System.out.println(getName() + " Is Swimming..........");
    }
}
