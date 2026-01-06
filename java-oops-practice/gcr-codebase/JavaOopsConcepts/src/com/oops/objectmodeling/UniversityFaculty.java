package com.bridgelabz.oops.objectmodeling;

public class UniversityFaculty {

	 public static void main(String[] args) {
	        // Create university
	        University university = new University("OXFord University");

	        // Create faculty
	        Faculty faculty1 = new Faculty("Dr. John", 101);
	        Faculty faculty2 = new Faculty("Dr. David", 102);
	        Faculty faculty3 = new Faculty("Dr. Luis", 103);

	        // Create departments
	        UniversityDepartment dept1 = new UniversityDepartment("Computer Science");
	        UniversityDepartment dept2 = new UniversityDepartment("Mathematics");

	        // Assign Faculty to departments
	        dept1.addFaculty(faculty1);
	        dept1.addFaculty(faculty2);
	        dept2.addFaculty(faculty2);
	        dept2.addFaculty(faculty3);

	        // Add departments to university
	        university.addDepartment(dept1);
	        university.addDepartment(dept2);

	        // Show all departments and their faculty members
	        university.showDepartments();

	        // Display Faculty Members independently 
	        System.out.println("\nDisplaying Faculty Members (any department):");
	        System.out.println(faculty1);
	        System.out.println(faculty2);
	        System.out.println(faculty3);
	    }

}
