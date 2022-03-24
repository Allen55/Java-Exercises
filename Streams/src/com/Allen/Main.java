package com.Allen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Streams

        List<Person> people = getPeople();

        // Imperative approach

        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);

        // Declarative approach

        // Filter
        // Sort
        // All match
        // Any match
        // None match
        // Max
        // Min
        // Group



    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 88, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

}
