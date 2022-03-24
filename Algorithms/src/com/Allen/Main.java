package com.Allen;

public class Main {

    public static void main(String[] args) {

        int[] sortedArray = {1, 3, 5, 8, 15, 30, 89};
        int low = sortedArray[0];
        int high = sortedArray.length-1;
        int key = 30;

        runBinarySearchRecursively(sortedArray, key, 0, high);

    }

    public static int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
        int middle = low  + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return runBinarySearchRecursively(sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively(sortedArray, key, middle + 1, high);
        }
    }
}
