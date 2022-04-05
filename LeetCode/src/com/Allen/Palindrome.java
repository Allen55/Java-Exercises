package com.Allen;

public class Palindrome {

    public static void main(String[] args) {
        String name = "moms";
        int i = 0, j = name.length() - 1;
        while(i < j){
            if(name.charAt(i) != name.charAt(j)){
                System.out.println("Not a palindrome");
            } else{
                System.out.println("Palindrome");
            }
            i++;
            j--;
        }
    }
}
