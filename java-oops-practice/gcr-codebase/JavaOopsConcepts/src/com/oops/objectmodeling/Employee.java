package com.oops.objectmodeling;

public class Employee {
	private String name;
	private int empId;
	private Department department;
	
	public Employee(String name, int empId, Department department) {
		this.name = name;
		this.empId = empId;
		this.department = department;
	}
	
	public void displayEmployee() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + name);
	}
}
