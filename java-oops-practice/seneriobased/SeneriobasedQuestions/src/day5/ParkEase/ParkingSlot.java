package day5.ParkEase;

public class ParkingSlot {

    // Encapsulated data
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // Constructor
    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false; // slot is free initially
    }

    // 1️⃣ Check availability
    public boolean isAvailable() {
        return !isOccupied;
    }

    // 2️⃣ Book the slot
    public void bookSlot() {
        if (!isOccupied) {
            isOccupied = true;
        }
    }

    // 3️⃣ Release the slot
    public void releaseSlot() {
        isOccupied = false;
    }

    // Info method
    public String getSlotInfo() {
        return "Slot ID: " + slotId +
               ", Allowed Vehicle: " + vehicleTypeAllowed +
               ", Occupied: " + isOccupied;
    }
}
