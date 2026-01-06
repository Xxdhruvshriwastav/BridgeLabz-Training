package com.bridgelabz.oops.objectmodeling;

public class UniversityStuPro {
	public static void main(String[] args) {
		
		StudentUni student1 = new StudentUni("S101", "Ashish");
		StudentUni student2 = new StudentUni("S102", "Swaraj");

		
		ProfessorUni professor1 = new ProfessorUni("P201", "Dr. Ravi");

		CourseUni course1 = new CourseUni("C301", "Data Structures");
		CourseUni course2 = new CourseUni("C302", "Operating Systems");

		student1.enrollCourses(course1);
		student1.enrollCourses(course2);
		student2.enrollCourses(course1);

		professor1.assignCourse(course1);
		professor1.assignCourse(course2);

		System.out.println("University Management System initialized successfully.");
	}
}
