package day1;

public class HospitalTest {

    public static void main(String[] args) {

        if (!HospitalUtils.validateUserInput("Rohan", 101)) return;

        Patient p1 = new InPatient("Rohan", 101, 204);
        Doctor d1 = new Doctor("Dr. Mehta", "Cardiology");

        p1.displayInfo();
        d1.displayInfo();

        Bill bill = new Bill(15000);
        HospitalUtils.showPaymentDetails(bill);
    }
}

