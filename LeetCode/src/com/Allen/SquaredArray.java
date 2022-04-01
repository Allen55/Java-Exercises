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

    public static void sortedSquares(int[] nums) {
        int mid = 0, n = nums.length;
        for (int i = 0; i < n; i++){
            mid = i;
            if(nums[i] >= 0){
                break;
            }
        }
        int L = mid - 1, R = mid;
        int[] arr = new int[n];
        int index = 0;
        while (0 <= L && R <= n - 1){
            int Left = nums[L] * nums[L];
            int Right = nums[R] * nums[R];
            if(Left > Right){
                arr[index] = Right;
                R++;
            } else {
                arr[index] = Left;
                L--;
            }
            index++;
        }
        while(0 <= L){
            arr[index++] = nums[L] * nums[L];
            L--;
        }
        while(R <= n - 1) {
            arr[index++] = nums[R] * nums[R];
            R++;
        }
        for (int s : arr){
            System.out.print(s + " ");
        }
    }


    public static void main(String[] args) {


        int[] intArray = {-4,-1,0,3,10};

        System.out.println("Array before sort: ");
        for (int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println(" ");

        sortedSquares(intArray);

    }



}
