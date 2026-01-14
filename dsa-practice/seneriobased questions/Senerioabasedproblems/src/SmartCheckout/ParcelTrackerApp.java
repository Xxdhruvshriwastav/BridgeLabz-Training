package SmartCheckout;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        // Add custom checkpoint
        tracker.addAfter("Shipped", "Custom Check");

        tracker.trackParcel();
    }
}
