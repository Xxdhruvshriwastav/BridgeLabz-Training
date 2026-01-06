package com.oops.constructor;

public class Student {

	//	access modifier
	 public int rollNumber;
	    protected String name;
	    private double cgpa;

	    // Constructor
	    Student(int rollNumber, String name, double cgpa) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.cgpa = cgpa;
	    }

	    // Public getter for CGPA
	    public double getCGPA() {
	        return cgpa;
	    }

	    // Public setter for CGPA
	    public void setCGPA(double cgpa) {
	        if (cgpa >= 0.0 && cgpa <= 10.0) {
	            this.cgpa = cgpa;
	        } else {
	            System.out.println("Invalid CGPA");
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(101, "Rahul Sharma", 8.4);

        // Accessing public and protected members
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Name: " + student.name);

        // Accessing private member using getter
        System.out.println("CGPA: " + student.getCGPA());

        // Modifying CGPA using setter
        student.setCGPA(9.1);
        System.out.println("Updated CGPA: " + student.getCGPA());
	}

}
