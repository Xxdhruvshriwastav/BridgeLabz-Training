package day5.ParkEase;

public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingSlot slot = new ParkingSlot("A1", "Car");
        Vehicle vehicle = new Car("BR01AB1234");

        ParkingManager manager = new ParkingManager();

        if (slot.isAvailable()) {
            slot.bookSlot();

            int hours = 6;
            double totalCharges = vehicle.calculateCharges(hours);

            manager.addLog("Vehicle parked in slot A1 for " + hours +
                    " hours. Total Charges: ₹" + totalCharges);
        }

        manager.showLogs();
        System.out.println(slot.getSlotInfo());
    }
}
