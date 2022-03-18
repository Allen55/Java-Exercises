package com.Allen;

// all the setting of a class is inside a method
// abstract the variables from the user to make it simpler to use the object
public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student();
        s.setName("Bob");
        System.out.println(s.getName());
        s.setAge(39);
        System.out.println(s.getAge());
    }
}
