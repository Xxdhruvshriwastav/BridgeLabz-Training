package TrainCompanion;


public class TrainRoute {

    private Compartment head;
    private Compartment tail;

    // Add compartment at end
    public void addCompartment(String name, String service) {

        Compartment newCompartment = new Compartment(name, service);

        if (head == null) {
            head = tail = newCompartment;
            return;
        }

        tail.next = newCompartment;
        newCompartment.prev = tail;
        tail = newCompartment;
    }

    // Remove compartment by name
    public void removeCompartment(String name) {

        Compartment current = head;

        while (current != null) {

            if (current.name.equals(name)) {

                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                }
                else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                System.out.println("❌ Compartment removed: " + name);
                return;
            }

            current = current.next;
        }

        System.out.println("Compartment not found");
    }

    // Traverse forward
    public void traverseForward() {

        Compartment temp = head;
        System.out.print("Forward Route: ");

        while (temp != null) {
            System.out.print(temp.name + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void traverseBackward() {

        Compartment temp = tail;
        System.out.print("Backward Route: ");

        while (temp != null) {
            System.out.print(temp.name + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Search for service
    public void searchService(String service) {

        Compartment temp = head;

        while (temp != null) {
            if (temp.service.equalsIgnoreCase(service)) {
                System.out.println("✅ Service '" + service +
                        "' available at compartment: " + temp.name);
                return;
            }
            temp = temp.next;
        }

        System.out.println("❌ Service not found: " + service);
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {

        Compartment temp = head;

        while (temp != null) {

            if (temp.name.equals(name)) {

                String prev = (temp.prev != null) ? temp.prev.name : "None";
                String next = (temp.next != null) ? temp.next.name : "None";

                System.out.println(
                    "📍 Current: " + temp.name +
                    " | Previous: " + prev +
                    " | Next: " + next
                );
                return;
            }

            temp = temp.next;
        }

        System.out.println("Compartment not found");
    }
}

