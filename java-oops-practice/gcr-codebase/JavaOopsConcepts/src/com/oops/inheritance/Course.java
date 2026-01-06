package com.oops.inheritance;

public class Course {

	public String courseName;
	public int duration;

	Course(String courseName, int duration) {

		this.courseName = courseName;
		this.duration = duration;
	}

	void displayinfoCourse() {

		System.out.println("Course name is " + courseName);
		System.out.println("duration is " + duration);
	}
}
