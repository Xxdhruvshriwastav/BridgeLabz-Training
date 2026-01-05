package com.inheritance;

public class OnlineCourse extends Course {

	public String platform;
	public String isRecorded;

	OnlineCourse(String courseName, int duration, String platform, String isRecorded) {
		super(courseName, duration);

		this.platform = platform;
		this.isRecorded = isRecorded;

	}

	void displayinfoOnlineCourse() {

		displayinfoCourse();
		System.out.println("The platform is " + platform);
		System.out.println("The duration is " + duration);
	}

}
