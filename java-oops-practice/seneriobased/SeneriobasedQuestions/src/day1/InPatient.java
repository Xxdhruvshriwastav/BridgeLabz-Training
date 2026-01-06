package day1;


class InPatient extends Patient {

    private int roomNumber;

    public InPatient(String name, int id, int roomNumber) {
        super(name, id);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admitted in Room: " + roomNumber);
    }
}


