package com.Allen;

public class Calculator {

    int gradeCount;
    double grade1;
    double grade2;
    double grade3;
    double grade4;



    Calculator(double a, double b, double c, double d, int gradeCount){
        this.grade1 = a;
        this.grade2 = b;
        this.grade3 = c;
        this.grade4 = d;
        this.gradeCount = gradeCount;
    }

    public static void getGPA(double a, double b, double c, double d, int gradeCount){
        double totalGpa = (a + b + c + d) / gradeCount;
        System.out.println(totalGpa);
    }


}
