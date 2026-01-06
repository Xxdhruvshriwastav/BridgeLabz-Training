package com.oops.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class StudentUni {
	private String studentId;
	private String name;
	private List<CourseUni> enrolledCourses = new ArrayList<>();
	
	public StudentUni(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public void enrollCourses(CourseUni course) {
		enrolledCourses.add(course);
		course.addStudent(this);
	}
}