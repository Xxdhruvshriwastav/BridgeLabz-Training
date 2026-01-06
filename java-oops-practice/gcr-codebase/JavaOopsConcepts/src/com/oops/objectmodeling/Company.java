package com.oops.objectmodeling;

import java.util.ArrayList;

public class Company {
	private String name;
	ArrayList<Department> departments;
	
	public Company(String name) {
		this.name = name;
		departments = new ArrayList<>();
	}
	
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public void showDepartments() {
		if(departments.isEmpty()) {
			System.out.println("We Currently have zero departments");
		}
		else {
			System.out.println("Department in " + name  + ": ");
			for(Department d: departments) {
				d.displayDepartment();
			}
		}
	}
	
	public String getName() {
		return name;
	}
}
