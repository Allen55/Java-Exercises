package com.Allen;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// JFrame = a GUI window to add componenets to

        /*
        JFrame frame = new JFrame(); // creates frame
        frame.setTitle("JFrame title goes here"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application on x-click
        frame.setResizable(false); // prevents frame from being resized.
        frame.setSize(420, 420 ); // sets the x-dimension and y dimension
        frame.setVisible(true); // makes it visible

        // ImageIcon image = new ImageIcon("logo.png");
        //frame.setIconImage((image.getImage()));
        frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background - RGB (0,0,0) - hexidecimal 0x123454 - Color.green
        */

        new MyFrame();

    }
}
