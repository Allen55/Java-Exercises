package com.Allen;

import java.util.Random;

public class DiceRoll {

    Random random;
    int number;

    DiceRoll(){
        random = new Random();
        roll();
    }
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
