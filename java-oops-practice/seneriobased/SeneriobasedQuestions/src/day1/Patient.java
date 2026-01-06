package day1;

public class Patient {

    private String name;
    private int id;
    private String medicalHistory;

    public Patient(String name, int id, String medicalHistory) {
        this.name = name;
        this.id = id;
        this.medicalHistory = medicalHistory;
    }

    public Patient(String name, int id) {
        this(name, id, "Not Available");
    }

    public String getSummary() {
        return "Patient " + name + " | ID " + id;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}
