package com.Allen;

public class Main {

    public static void main(String[] args) {

        pyramidPattern(5);
    }

    public static void pyramidPattern(int n){

        for(int i = 0; i < n; i++){
            System.out.print("");
            for(int j = 0; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
