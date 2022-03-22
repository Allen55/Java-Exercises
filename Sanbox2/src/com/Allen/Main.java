package com.Allen;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "hello this is Allen", nstr = ""; // olleh""
        char ch;
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        for(char c : charArray){
            //System.out.println(c);
        }
        for (int i = 0; i < str.length()-1; i--){
            
        }

        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
            //System.out.println(str.charAt(i));
        }
        System.out.println(nstr.toLowerCase());
    }
}
