package com.Allen;

/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.



Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
Example 2:

Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".
 */


public class FirstPalindrome {


    public static String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String str){

        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {

        String[] stringArray = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(stringArray));

    }
}





/*for(int i = 0; i < words.length; i++){

            int j = 0, k = words[i].length() - 1;
            String currentWord = words[i];
            while(j < k){
                if(currentWord.charAt(i) != currentWord.charAt(k)){
                    break;
                } else if (currentWord.charAt(i) == currentWord.charAt(k)){
                    j++;
                    k--;
                }
                return "found";
            }
        }
        return "No palindrome found";*/