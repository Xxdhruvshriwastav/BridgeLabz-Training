package com.oops.objectmodeling;

public class DoctorHospital {

	  public static void main(String[] args) {
	        // Create hospital
	        Hospital hospital = new Hospital("City Hospital");

	        // Create doctors
	        Doctor doctor1 = new Doctor("Dr. Vedansh", 101);
	        Doctor doctor2 = new Doctor("Dr. Ravi", 102);

	        // Create patients
	        Patient patient1 = new Patient("Ashish", 201);
	        Patient patient2 = new Patient("Swaraj", 202);

	        // Add doctors to hospital
	        hospital.addDoctor(doctor1);
	        hospital.addDoctor(doctor2);

	        // Add patients to hospital
	        hospital.addPatient(patient1);
	        hospital.addPatient(patient2);

	        // Create relationships between doctors and patients
	        doctor1.addPatient(patient1);
	        doctor1.addPatient(patient2);
	        doctor2.addPatient(patient2);

	        patient1.addDoctor(doctor1);
	        patient2.addDoctor(doctor1);
	        patient2.addDoctor(doctor2);

	        // Consultations
	        doctor1.consult(patient1);
	        doctor2.consult(patient2);
	        patient1.consult(doctor1);
	        patient2.consult(doctor2);

	        // Show doctors and patients
	        hospital.showDoctorsAndPatients();
	    }

}
