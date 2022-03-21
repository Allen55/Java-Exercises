package com.Allen;

public abstract class Animal {
    private int age;
    String name;
    int legs;


    public abstract void makeNoise();

    public void printName(){
        System.out.println("My name is " + name);
    }

}
