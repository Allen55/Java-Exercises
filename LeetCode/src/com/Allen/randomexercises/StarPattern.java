package com.Allen.randomexercises;

//Write a program called SquarePattern that prompts user for the size (a non-negative integer in int); and prints the following square pattern using two nested for-loops.
//
//Enter the size: 5
//# # # # #
//# # # # #
//# # # # #
//# # # # #
//# # # # #

import java.util.Scanner;

public class StarPattern {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 5-10: ");
        int input = in.nextInt();
        if(input < 5){
            System.out.println("Number needs to be between 5-10");
        }

        for(int i = 0; i < input; i++){
            System.out.print('*');
            for(int j = 0; j < input; j++){
                System.out.print('*' + " ");
            }
        }

    }
}
