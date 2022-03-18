package com.Allen;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// HashMap implements the Map interface (need import)
        // Hashmap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper class
        // ex. (name,email),(username,userID),(country,capital)

        HashMap<String, String> countries = new HashMap();

        // add a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Dehli");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        // System.out.println(countries);
       // countries.remove("USA");


        // get
        System.out.println(countries.get("Russia"));

        //clear
        //countries.clear();
        //System.out.println(countries);

        // get size
        System.out.println(countries.size());

        // replace
        countries.replace("USA", "Detroit");
        System.out.println(countries);

        // contains key
        System.out.println(countries.containsKey("England"));

        //contains value
        System.out.println(countries.containsValue("Detroit"));
        System.out.println(countries.keySet());
        System.out.println("\n\n");
        // Formatting
        for(String i : countries.keySet()){
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }

    }
}
