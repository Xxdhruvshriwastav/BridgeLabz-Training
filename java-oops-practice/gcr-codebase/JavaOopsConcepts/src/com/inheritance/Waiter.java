package com.inheritance;

public class Waiter extends Person implements Worker {
    public String shift;

    public Waiter(String name, int age, String shift) {
        super(name, age);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers during the " + shift + " shift.");
    }
}
