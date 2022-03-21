package com.Allen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // recursion = the process in which a method calls itself continuously,
        // a method that calls itself is called a recursive function
        // useful for factorials, traversing trees, and simplifying a complex task

        Scanner scan = new Scanner(System.in);
        System.out.print("How far do you want to walk in meters? ");
        int distance = scan.nextInt();

        takeAStep(0, distance);

    }

    static void takeAStep(int i, int distance){

       if(i < distance){
           i++;
           System.out.println("You take a step: " + i + " meters/s");
           takeAStep(i, distance);
       } else {
           System.out.println("You are done walking");
       }

    }

}
