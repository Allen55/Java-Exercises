package com.Allen.randomexercises;

// Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100.
// Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily. Also compute and display the average.
// The output shall look like:
//   The sum of 1 to 100 is 5050
//   The average is 50.5

import org.w3c.dom.ls.LSOutput;

public class SumAverageRunningInt {

    public static void main(String[] args) {

        int max = 100;
        int count = 0;

        for (int i = 0; i <= max; i++) {
            count+=i;
        }
        System.out.println(count / max);

    }
}
