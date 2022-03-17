package com.Allen;

public class LinearSearch {

    public static void main(String[] args) {

        int[] intArray = {15, 35, -15, 83, 5};

        System.out.println(linearSearch(intArray, -13));

    }

    public static int linearSearch(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }


}
