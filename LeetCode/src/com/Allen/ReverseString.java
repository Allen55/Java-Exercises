package com.Allen;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */


public class ReverseString {

    public static void reverseString(char[] s) {
        int L = 0, n = s.length, R = n - 1;
        char temp;
        while (L < R){
            temp = s[R];
            s[R] = s[L];
            s[L] = temp;
            L++;
            R--;
        }
        for (char i : s){
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

    }

    public static class RemoveZeroes {
    }
}
