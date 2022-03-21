package com.Allen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String studentName;
        int studentYear;
        int[] grades = new int[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Code University! To sign up please enter the information below.");
        System.out.print("Name: ");
        studentName = scanner.nextLine();
        System.out.print("Current education year: ");
        studentYear = scanner.nextInt();

        System.out.println("Grades from this year ");
        System.out.print("Grade 1: ");
        grades[0] = scanner.nextInt();
        System.out.print("Grade 2: ");
        grades[1] = scanner.nextInt();
        System.out.print("Grade 3: ");
        grades[2] = scanner.nextInt();
        System.out.print("Grade 4: ");
        grades[3] = scanner.nextInt();

        double gpa = calculateGpa(grades);

        Student student1 = new Student(studentName, studentYear, gpa);
        student1.printInfo();
    }

    public static int calculateGpa(int[] grades){

        int sum = 0;

        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return sum / grades.length;
    }



}
