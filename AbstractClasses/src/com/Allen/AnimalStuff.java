package com.Allen;

public interface AnimalStuff {

    // Every field declared in an interface is static and final
    //int age = 1;
    //String name = "Larry"; // Not good practice....
    //                      because every field in an interface is automatically static
                            // that means the same values applies to the every object in that class

    void makeNoise();

    public void poop(); // every method in an interface is assumed to be abstract
}
