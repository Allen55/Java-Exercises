package com.Allen;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10 ) return true;

        int digits = (int)Math.floor(Math.log10(x));

        for (int i = 0; i < (digits/2)+1; i++){
            int a = (x / (int)Math.pow(10,i))%10;
            int b = (x / (int)Math.pow(10,digits-i))%10;
            if (a != b) return false;
        }
        return true;


    }

    public static void main(String[] args) {


        int num = 12421;

        System.out.println(isPalindrome(num));
    }
}
