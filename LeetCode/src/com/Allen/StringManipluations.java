package com.Allen;

import java.util.HashMap;
import java.util.Hashtable;

public class StringManipluations {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Heli this is intro to intro");

        Hashtable<String, Integer> hash = new Hashtable<>();


        int count = 0;
        String iCount = "aCount";

        for (int i = 0; i < sb.length(); i++){
           if (sb.charAt(i) == 'i'){
               count++;
               hash.put(iCount, count);
           }
        }
        System.out.println(hash.keySet());
    }
}
