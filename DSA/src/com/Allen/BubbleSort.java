package com.Allen;

// algorithm degrades quickly as it grows
//In place algorithm
//O(N^2) - quadratic
//It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000
public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j){

        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
