package com.inheritance;

public class Chef extends Person implements Worker {

    public String specialty;

    public Chef(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Specialty: " + specialty);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing delicious " + specialty + " dishes.");
    }

}
