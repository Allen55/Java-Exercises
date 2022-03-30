package com.Allen;

public class BubbleSort2 {

    public static void main(String[] args) {
        int[] nums = {19,4,1,13,67,9,22,4};
        int temp = 0;  // 19

        int n = nums.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }
        for (int x : nums){
            System.out.println(x);
        }
    }
}
