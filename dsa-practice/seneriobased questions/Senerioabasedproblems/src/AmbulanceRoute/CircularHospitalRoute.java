package AmbulanceRoute;

public class CircularHospitalRoute {

    private HospitalUnit head;

    // Add hospital unit
    public void addUnit(String name, boolean available) {

        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newUnit;
        newUnit.next = head;
    }

    // Find nearest available unit (rotation)
    public void findAvailableUnit() {

        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnit current = head;

        do {
            System.out.println("Checking: " + current.name);

            if (current.available) {
                System.out.println("✅ Patient redirected to: " + current.name);
                return;
            }

            current = current.next;

        } while (current != head);

        System.out.println("❌ No unit available right now");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {

        if (head == null) return;

        HospitalUnit current = head;
        HospitalUnit prev = null;

        do {
            if (current.name.equals(unitName)) {

                // Single unit case
                if (current == head && current.next == head) {
                    head = null;
                    System.out.println("🛠 Unit removed: " + unitName);
                    return;
                }

                // Head removal
                if (current == head) {
                    HospitalUnit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println("🛠 Unit removed: " + unitName);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);
    }

    // Display hospital route
    public void displayUnits() {

        if (head == null) {
            System.out.println("No hospital units");
            return;
        }

        HospitalUnit temp = head;
        System.out.print("Hospital Route: ");

        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to " + head.name + ")");
    }
}
