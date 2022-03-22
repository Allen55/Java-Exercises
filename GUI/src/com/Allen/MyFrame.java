package com.Allen;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        JFrame frame = new JFrame(); // creates frame
        this.setTitle("JFrame title goes here"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application on x-click
        this.setResizable(false); // prevents frame from being resized.
        this.setSize(420, 420 ); // sets the x-dimension and y dimension
        this.setVisible(true); // makes it visible

        // ImageIcon image = new ImageIcon("logo.png");
        //this.setIconImage((image.getImage()));
        this.getContentPane().setBackground(new Color(123,50,250)); // change color of background - RGB (0,0,0) - hexidecimal 0x123454 - Color.green
    }
}
