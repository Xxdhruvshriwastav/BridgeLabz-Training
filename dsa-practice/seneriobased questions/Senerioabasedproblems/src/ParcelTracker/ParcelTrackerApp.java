package ParcelTracker;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        // Default delivery stages
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        // Add custom intermediate checkpoint
        tracker.addAfter("Shipped", "Custom Check");

        // Track parcel
        tracker.trackParcel();

        // Try adding after non-existing stage (null handling)
        tracker.addAfter("Out for Pickup", "Warehouse Hold");
    }
}
