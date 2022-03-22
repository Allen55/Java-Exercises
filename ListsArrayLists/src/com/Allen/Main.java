package com.Allen;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "blueberry";
        fruits[1] = "strawberry";
        fruits[2] = "apple";

        ArrayList<String> fruitsArrayList = new ArrayList();
        fruitsArrayList.add("pineapple");
        fruitsArrayList.add("huckleberry");
        fruitsArrayList.set(0, "onion");

        for(String x : fruits) {
            System.out.print(x + " ");
            System.out.println();
        }
        System.out.println(fruitsArrayList);

        ArrayList<String> test = new ArrayList();

    }
}
