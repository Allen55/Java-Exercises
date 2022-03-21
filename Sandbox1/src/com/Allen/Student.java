package com.Allen;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String[] courses;

    public Student(String name, int gradeLevel, double gpa) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;

    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Student grade level: " + gradeLevel);
        System.out.println("Student gpa: " + gpa);
    }

}
