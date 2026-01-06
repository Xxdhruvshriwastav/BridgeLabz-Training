package com.oops.inheritance;

public class Student extends Person {

    public String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }

}
