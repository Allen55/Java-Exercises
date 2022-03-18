package com.Allen;

public class ByThrees implements Series {

    int val;

    ByThrees(){
        val = 0;
    }

    public int getNext(){
        val += 3;
        return val;
    }

    public int getPrev(){
        val -= 2;
        return val;
    }

}
