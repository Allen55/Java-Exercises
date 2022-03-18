package com.Allen;

public class Main {

    public static void main(String[] args) {


        //Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();
    }
}

// abstract == abstract classes cannot be instantiated, but they can have a subclass
//              abstract methods are declared without an implementation
// only exposing the neccessary details by whoever needs the object
// decouples the user from the underlying implementation

// "only care about calling the method and not about the underlying implementation"
