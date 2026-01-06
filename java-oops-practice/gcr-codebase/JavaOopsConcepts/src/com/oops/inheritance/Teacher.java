package com.oops.inheritance;

public class Teacher extends Person {
    public String subject;
    public int experience;

    public Teacher(String name, int age, String subject, int experience) {
        super(name, age);
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
    }
}