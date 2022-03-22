package com.Allen;

import java.util.LinkedList;

// ********************************************************************
// LinkedList =           Nodes are in 2 parts (data + address)
//                        Nodes are in non-consecutive memory locations
//                        Elements are linked using pointers
//
// Advantages?
//    1. Dynamic Data Structure (allocates needed memory while running)
//    2. Insertion and Deletion of Nodes is easy. O(1)
//    3. No/Low memory waste
//
// Disadvantages?
//    1. Greater memory usage (additional pointer)
//    2. No random access of elements (no index [i])
//    3. Accessing/searching elements is more time consuming. O(n)
//
// Uses?
//    1. implement Stacks/Queues
//    2. GPS navigation
//    3. music playlist
// *********************************************************************

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList();

        // stack
        list1.push("A");
        list1.push("B");
        list1.push("C");
        list1.push("D");
        list1.push("F");
        list1.pop();

        System.out.println(list1); // output -> [D, C, B, A]

        LinkedList<String> list2 = new LinkedList<>();

        // queue
        list2.offer("A");
        list2.offer("B");
        list2.offer("C");
        list2.offer("D");
        list2.offer("F");
        list2.poll();

        System.out.println(list2); // output -> [B, C, D, F]

        LinkedList<String> list3 = new LinkedList<>();

        list3.offer("A");
        list3.offer("B");
        list3.offer("C");
        list3.offer("D");
        list3.offer("F");

        list3.add(3, "E");
        list3.remove("D");

        System.out.println(list3.peekFirst());
        System.out.println(list3.peekLast());
        list3.addFirst("0");
        list3.addLast("G");
        String first = list3.removeFirst();

        System.out.println(list3);

    }
}


