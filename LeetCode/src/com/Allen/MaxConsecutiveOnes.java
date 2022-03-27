package com.Allen;

/*
 The only parameter is nums; an Array. You couldn't possibly solve this question without knowing how long nums is.
 Well, luckily it's straightforward. When an Array is given as a parameter, without any additional information,
 you can safely assume that length == capacity. That is, the Array is the exact right size to hold all of it's data.
 We can, therefore, use .length




Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.


Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2


Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.


 */

public class MaxConsecutiveOnes {



    public static int findMaxConsecutiveOnes(int[] nums) {

        int currentSum = 0;
        int highestSum = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                currentSum = 0;
            } else {
                currentSum++;
                highestSum = Math.max(highestSum, currentSum);
            }
        }
        return highestSum;
    }


    public static void main(String[] args) {

        int[] intArray = {1,1,0,1,1,1,0,0,1,1,0,0,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(intArray));
    }
}
