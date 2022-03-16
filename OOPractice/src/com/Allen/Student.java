package com.Allen;

public class Student {

    String name;
    int year;
    double gpa;

    public Student(String name, int year, double gpa){
        this.name = name;
        this.year = year;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void getAllInfo(){
        System.out.println("Student name: " + name + ", Year: " + year + ", GPA: " + gpa);
    }

}
