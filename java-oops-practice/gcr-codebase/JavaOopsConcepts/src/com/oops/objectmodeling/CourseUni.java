package com.oops.objectmodeling;

import java.util.*;

public class CourseUni {
	private String courseId;
	private String courseName;
	private ProfessorUni professor;
	private List<StudentUni> students = new ArrayList<>();
	
	public CourseUni(String corseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public void assignProfessor(ProfessorUni professor) {
		this.professor = professor;
	}
	
	public void addStudent(StudentUni student) {
		students.add(student);
	}
}