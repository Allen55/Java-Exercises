package com.Allen;
/*
Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
 */

public class reverseWords {

    public static void reverseWords(String s) {

        if (s == null || s.length() == 0){
            System.out.println(s);
        }

        StringBuilder result = new StringBuilder();
        String[] splitWords =  s.split(" ");

        System.out.println(splitWords);
        for (String word : splitWords){
            StringBuilder wordSp = new StringBuilder();
            wordSp.append(word);
            wordSp.reverse();
            result.append(wordSp.toString() + " ");
        }
        }


    public static void main(String[] args) {

        String sentenceToReverse = "Let's take LeetCode contest";
        reverseWords(sentenceToReverse);
    }


}
