package com.Allen;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Hashtable - A data structure that stores unique keys to values ex. <Integer, String>
        //             Each key/value pair is known as an Entry
        //             FAST insertion, look up, deletion of key/value pairs
        //             Not ideal for small data sets, great with large data sets
        //
        // Hashing  - takes a key and computes an integer (formula will vary based on key & data type)
        //            In a hashtable, we use the hash % capacity to calculate an index number
        //
        // bucket  -  an indexed storage location for one or more Entries
        //            can store multiple Entries in case of a collision (linked similarly to a LinkedList)
        //
        // collision- hash function  generations the same index for more than one key
        //            less collisions = more efficiency
        //
        // Runtime complexity : Best case O(1)
        //                      Worst case O(n)

        // initial capacity of 11 elements and load factor of .75


        Hashtable<String, String> table = new Hashtable<>();

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //table.remove(777);


        for(String key : table.keySet())  // can iterate over set
        System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table.get(key));



    }
}
