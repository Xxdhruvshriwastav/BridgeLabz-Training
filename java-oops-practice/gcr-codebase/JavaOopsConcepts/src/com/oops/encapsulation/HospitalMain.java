package com.oops.encapsulation;

class HospitalMain {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Sandeep", 28, 5, 2000);
        Patient p2 = new OutPatient(102, "Rohit", 32, 500);

        // Polymorphism
        Patient patients[] = { p1, p2 };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            System.out.println("----------------------");
        }
    }
}
