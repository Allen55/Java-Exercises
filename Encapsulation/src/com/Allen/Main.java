package com.Allen;

public class Main {

    public static void main(String[] args) {
	// Encapsulation =  attributes of a class will be hidden or private
        //              Can be accessed only through methods (getters & setters)
        //              You should make attributes private if you don't have a reason to make them public/protected

        Car car1 = new Car("Chevrolet", "Camero", 2022);
        //Car car2 = new Car("Honda", "Civic", 1998 );
        Car car2 = new Car(car1);

        // car1 = car2  You do not want to do this. With the two adddress of these cars,
        //              car2 and car1 are now the same exact car because they have the same address.
        //              All that's done is the car 2 different names
        //              car1 and car2 now are pointing to the same car in memory

        //car2.copy(car1);

        System.out.println("car 1 memory address: " + car1);
        System.out.println("car 2 memory address: " + car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());



    }
}
