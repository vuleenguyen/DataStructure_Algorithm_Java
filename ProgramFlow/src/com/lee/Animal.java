package com.lee;

/**
 * Created by Do My Duyen on 9/20/2017.
 */
public class Animal {

    private String name;
    private int age;
    private String gender;
    private double pound;

    public Animal(int age, String gender, double pound) {
        this.age = age;
        this.gender = gender;
        this.pound = pound;
    }

    public Animal(int age, String gender, double pound, String name) {
        this(age,gender,pound);
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " Is Eating.........");
    }

    public void sleep() {
        System.out.println(this.name + " Is Sleeping........");
    }

    public String getName() {
        return name;
    }
}
