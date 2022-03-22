package com.Allen;

public class MathTeacher extends Teacher {

    String mainSubject;

    @Override
    public void printSubject(){
        System.out.println("I'm a " + designation + " who teaches math");
    }

}
