package com.tnsif.methods;

public class Student {
	    String name;
	    int age;
	    double marks;

	    // Default constructor
	    Student() {
	        name = "Unknown";
	        age = 0;
	        marks = 0.0;
	    }

	    // Constructor with 1 parameter
	    Student(String n) {
	        name = n;
	        age = 0;
	        marks = 0.0;
	    }

	    // Constructor with 2 parameters
	    Student(String n, int a) {
	        name = n;
	        age = a;
	        marks = 40.0;
	    }

	    // Constructor with 3 parameters (different sequence/type possible)
	    Student(int a, String n, double m) {
	        name = n;
	        age = a;
	        marks = m;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
	    }

	    public static void main(String[] args) {
	        // Using different constructors
	        Student s1 = new Student();
	        Student s2 = new Student("Alice");
	        Student s3 = new Student("Bob", 20);
	        Student s4 = new Student(22, "Charlie", 88.5);

	        s1.display();
	        s2.display();
	        s3.display();
	        s4.display();
	    }
	}
