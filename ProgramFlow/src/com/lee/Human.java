package com.lee;

import javax.xml.transform.sax.SAXSource;

/**
 * Created by Do My Duyen on 9/20/2017.
 */
public class Human {

    public String name;
    public int age;
    public int heightOfInch;
    public String eyeColor;

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightOfInch + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }
}
