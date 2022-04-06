package com.Allen;

public class Playground {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};

        int start = 0, end = nums.length - 1, sum = 0;

            while( start < end) {
                //System.out.println(nums[start] + nums[end]);
                sum = nums[start] + nums[end];
                System.out.println(sum);
                start++;
                end--;
            }
    }
}
