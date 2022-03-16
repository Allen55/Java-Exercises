package com.Allen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student year: ");
        int year = scanner.nextInt();
        System.out.println("Enter student gpa: ");
        double gpa = scanner.nextDouble();

        Student student1 = new Student(name, year, gpa);

        student1.getAllInfo();
    }
}
