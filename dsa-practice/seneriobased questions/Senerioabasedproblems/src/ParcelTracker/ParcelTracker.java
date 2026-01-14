package ParcelTracker;

public class ParcelTracker {

    private Stage head;   // starting stage

    // 1️⃣ Add stage at end (Packed → Shipped → ...)
    public void addStage(String stageName) {

        Stage newStage = new Stage(stageName);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    // 2️⃣ Add intermediate checkpoint
    public void addAfter(String existingStage, String newStageName) {

        Stage temp = head;

        while (temp != null && !temp.stageName.equals(existingStage)) {
            temp = temp.next;
        }

        // null pointer handling (lost parcel / stage missing)
        if (temp == null) {
            System.out.println("Stage '" + existingStage + "' not found. Parcel may be lost.");
            return;
        }

        Stage newStage = new Stage(newStageName);
        newStage.next = temp.next;
        temp.next = newStage;
    }

    // 3️⃣ Forward tracking through stages
    public void trackParcel() {

        if (head == null) {
            System.out.println("No tracking data available.");
            return;
        }

        Stage temp = head;
        System.out.print("Parcel Status: ");

        while (temp != null) {
            System.out.print(temp.stageName + " → ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}
