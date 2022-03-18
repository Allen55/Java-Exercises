package com.Allen;

// Non-recursive factorial
public class Recursion {

    public static void main(String[] args) {
        int num = 4;
        System.out.println(iterativeFactorial(num));
        System.out.println(recursiveFactorial(num));
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n * (n-1)!

    // no recursive calls return until the receive the calls they return recursively

    public static int recursiveFactorial(int num){
        // base case / breaking condition
        if (num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num){

        if (num == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
            // 1 = 1 * 1 -> 1
            // 1 = 1 * 1 -> 1
            // 1 = 1 * 2 -> 2
            // 2 = 2 * 3 -> 6
            // 6 = 6 * 4 -> 24
            // 24 = 24 * 5 -> 120
        }
        return factorial;
    }
}
