package com.lee;

/**
 * Created by Do My Duyen on 9/20/2017.
 */
public class Bird extends Animal {

    public Bird(int age, String gender, double pound) {
        super(age, gender, pound);
    }

    public Bird(int age, String gender, double pound, String name) {
        super(age, gender, pound, name);
    }

    public void fly() {
        System.out.println(getName() + " Is Flying....");
    }
}
