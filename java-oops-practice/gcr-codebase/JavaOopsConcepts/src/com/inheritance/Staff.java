package com.inheritance;

public class Staff extends Person {

    public String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
