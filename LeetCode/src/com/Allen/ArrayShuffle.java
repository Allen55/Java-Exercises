package com.Allen;

public class ArrayShuffle {

    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7}; // ->//  [  2, 5, 1, 3, 4, 7 ]
            //                                  x1 x2 x3 y1 y2 y3
         //                                  [  2, 3, 5, 4, 1, 7  ]
        //                                     x1  y1 x2 y2 x3 y3
        int n = 3;
        for(int i : nums){
            System.out.print(i + " ");
        }

        if (nums.length % 2 == 1){
            System.out.println("-1");
        }

        int start = 1, second = nums[start] + (n - 1), temp = 0;

        /*while (start < n) {
            temp = nums[second];
            nums[second] = nums[start];
            nums[start] = temp;
            start++;
        }*/

        for (int i = 1; i < n; i++){
            temp = nums[i+n -1];
            nums[i+n-1] = nums[i];
            nums[i] = temp;
        }


        System.out.println("");
        for(int element : nums){
            System.out.print(element + " ");
        }

    }
}
