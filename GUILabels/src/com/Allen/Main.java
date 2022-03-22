package com.Allen;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// JLabel = a GUI display area for a string of text, an image or both

        JLabel label = new JLabel(); // create a label
        label.setText("Do you even code?"); // sets the text of the label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0,0,0)); // set color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font style and size
        label.setIconTextGap(100); // set gap of text to image
        label.setBackground(new Color(123, 10, 250));
        label.setOpaque(true);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(label);

    }
}
