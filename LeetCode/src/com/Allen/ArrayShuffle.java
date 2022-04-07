package com.Allen;

public class ArrayShuffle {

    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7}; // -> [2,3,5,4,1,7]
        for(int i : nums){
            System.out.print(i + " ");
        }

        if (nums.length % 2 == 1){
            System.out.println("-1");
        }

        int start = 1, end = nums.length - 2, temp = 0;

        while (start < end) {
            temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            temp++;
            end--;
        }

        System.out.println("");
        for(int element : nums){
            System.out.print(element + " ");
        }

    }
}
