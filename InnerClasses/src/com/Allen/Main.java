package com.Allen;

public class Main {

    public static void main(String[] args) {

        // inner class - A class inside of another class
        //               useful if a class should not be limited in scope
        //               usually private but not neccessary
        //               helps group clsses that belong together
        //               extremely useful for listeners handling specific events
        //               precursor for anonymous classes

        Outside out = new Outside();
        Outside.Inside in = out.new Inside();
        in.Greeting();

    }
}
