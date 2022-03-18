package com.Allen;

public class Main {

    public static void main(String[] args) {
	// Encapsulation =  attributes of a class will be hidden or private
        //              Can be accessed only through methods (getters & setters)
        //              You should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Chevrolet", "Camero", 2022);

        car.setMake("Subaru");
        car.setModel("WRX");
        car.setYear(2008);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());



    }
}
