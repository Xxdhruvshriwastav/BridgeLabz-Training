package SmartCheckout;

public class ParcelTracker {

    Stage head;

    // Add stage at end
    public void addStage(String name) {
        Stage newStage = new Stage(name);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newStage;
    }

    // Add intermediate stage
    public void addAfter(String target, String newStageName) {

        Stage curr = head;

        while (curr != null && !curr.name.equals(target)) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Stage not found. Parcel may be lost.");
            return;
        }

        Stage newStage = new Stage(newStageName);
        newStage.next = curr.next;
        curr.next = newStage;
    }

    // Track parcel
    public void trackParcel() {

        if (head == null) {
            System.out.println("No tracking information available");
            return;
        }

        Stage curr = head;
        while (curr != null) {
            System.out.print(curr.name + " → ");
            curr = curr.next;
        }
        System.out.println("DELIVERED");
    }
}

