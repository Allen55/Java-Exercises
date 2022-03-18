package com.Allen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// exceptions = an event that occurs during the execution of a program that
        //          disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z); // when y = 0, arithmetic exception
        }
        catch(ArithmeticException e) {
            System.out.println("You can't divide by 0!");
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter a number!");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }
    }
}
