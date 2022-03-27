package com.Allen;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[100];


        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int target = 77;
        int index = binarySearch(array, target);

    }

    private static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;
        int count = 0; // optional

        while (low <= high){
            int middle = low + (high-low) / 2;
            int value = array[middle];
            count++;
            System.out.println("Step: " + count + " middle: " + value);

            if (value < target) {
                low = middle + 1;
            }
            else if (value > target) {
                high = middle -1;
            }
            else {
                return middle; // target is found
            }

            /*




             */

        }
        return -1; // sentinal value, target not found
    }
}
