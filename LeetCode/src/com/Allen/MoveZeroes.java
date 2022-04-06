package com.Allen;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */

public class MoveZeroes {



    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        for(int x : nums){
            System.out.print(x + " ");
        }
        int start = 0;
        int end = nums.length - 1;
        int temp;

        if (nums.length < 1 || nums == null){
            System.out.println("invalid");
        }

        while( start < end ){
            if(nums[start] != 0){
               start++;
            } else {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(" ");
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}
