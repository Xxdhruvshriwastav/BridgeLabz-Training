package com.oops.inheritance;

public class PaidOnlineCourse extends OnlineCourse {

	public int fee;
	public double discount;

	PaidOnlineCourse(String courseName, int duration, String platform, String isRecorded, int fee, double discount) {
		super(courseName, duration, platform, isRecorded);

		this.fee = fee;
		this.discount = discount;

	}

	void displayinfoPaidOnlineCourse() {
		displayinfoOnlineCourse();
		System.out.println("The fee is " + fee);
		System.out.println("The discount is " + discount);

	}

}
