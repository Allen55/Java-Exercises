package com.Allen;

public class Cat extends Animal implements AnimalStuff {

    Cat(){

    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public int getLegs(){
        return legs;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
        System.out.println("I have 4 legs");
    }

    @Override
    public void poop() {

    }
}
