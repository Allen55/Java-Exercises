package com.Allen;

public class Main {

    public static void main(String[] args) {

        ByTwos byTwos = new ByTwos();
        Series ob; // series object
        byTwos.printStuff();

        for(int i = 0; i < 6; i++){
            ob = byTwos;
            System.out.println("By twos: " + ob.getNext());
        }
    }
}
