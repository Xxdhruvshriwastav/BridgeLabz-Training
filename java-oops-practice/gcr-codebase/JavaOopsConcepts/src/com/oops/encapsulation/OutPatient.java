package com.oops.encapsulation;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private String medicalHistory = "";

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:\n" + medicalHistory);
    }
}

