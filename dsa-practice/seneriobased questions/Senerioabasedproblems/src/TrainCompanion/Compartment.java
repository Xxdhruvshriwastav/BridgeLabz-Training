package TrainCompanion;


public class Compartment {

    String name;
    String service;   // Pantry, WiFi, Normal
    Compartment prev;
    Compartment next;

    public Compartment(String name, String service) {
        this.name = name;
        this.service = service;
        this.prev = null;
        this.next = null;
    }
}
