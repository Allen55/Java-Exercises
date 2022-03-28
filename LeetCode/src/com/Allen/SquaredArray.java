package com.Allen;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.


Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

public class SquaredArray {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int temp = 0;

        for (int i = 0; i < n; i++){
            for (int j = 1; j < (n-i); j++){
                if (nums[j-1] > nums[j]){
                    temp = nums[j-1];      //swap elements
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {


        int[] intArray = {-4,-1,0,3,10};

        System.out.println("Array before sort: ");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println(" ");
        sortedSquares(intArray);
        System.out.println("Array after sort: ");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }



}
