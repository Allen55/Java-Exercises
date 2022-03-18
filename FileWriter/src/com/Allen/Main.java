package com.Allen;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String name;

        try (FileWriter userWriter = new FileWriter("userPoem.txt")) {
            System.out.print("Enter the first line: ");
            String line1 = scanner.nextLine();
            System.out.print("Enter second line: ");
            String line2 = scanner.nextLine();
            System.out.print("What is your name? ");
            name = scanner.nextLine();
            System.out.println("Poem by " + name + " saved to file");
            userWriter.write(line1 + "\n");
            userWriter.write(line2);
            userWriter.write("\nwritten by " + name);

            userWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }



        try (FileWriter writer = new FileWriter("poem.txt")) {
            writer.write("Roses are red \nViolets are blue \nsomethin something \nrockin' everywhere");
            writer.append("\n(A poem by Allen)");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
