package com.Allen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // polymorphism = many shapes/forms
        // dynamic = after compilation/after compiling (during runtime)
        // dynamic polymorphism = taking many shapes/forms after the program runs/during runtime
        // ex. A a corvette is a: corvette, and a car, and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1 = dog) or (2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2){
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }


}
