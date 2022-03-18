package com.Allen;

public interface Series {

    int MAX = 10;
    String ERRORMSG = "Cannot go above " + MAX;
    int getNext();
    int getPrev();

    default void printStuff(){  // needs to have a default in order to have a bdoy
        System.out.println("Live from Texas. It's Friday...");
        printMoreStuff();
    }

    private void printMoreStuff(){
        System.out.println("Print more stuff");
    }


}
