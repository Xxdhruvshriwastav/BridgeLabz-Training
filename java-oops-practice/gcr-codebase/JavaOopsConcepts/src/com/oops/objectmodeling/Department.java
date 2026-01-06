package com.oops.objectmodeling;

import java.util.ArrayList;

public class Department {
	private String name;
	private Company company;
	ArrayList<Employee> employees;
	
	public Department(String name, Company company){
		this.name = name;
		this.company = company;
		employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void displayDepartment() {
		System.out.println("Department Name: " + name);
	}
	
	public void displayEmployees() {
		System.out.println("Employees in " + name + " Department.....");
		if(employees.isEmpty()) {
			System.out.println("We Currently Have Zero Employees....");
		}
		else {
			for(Employee e: employees) {
				e.displayEmployee();
			}
		}
	}
}
