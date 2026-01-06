
package day1;


class OutPatient extends Patient {

    private String appointmentDate;

    public OutPatient(String name, int id, String appointmentDate) {
        super(name, id);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Appointment Date: " + appointmentDate);
    }
}
