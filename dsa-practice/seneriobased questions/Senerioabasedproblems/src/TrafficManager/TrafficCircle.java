package TrafficManager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficCircle {

    private Vehicle head;
    private Queue<String> waitingQueue;
    private int maxQueueSize = 5;

    public TrafficCircle() {
        waitingQueue = new LinkedList<>();
    }

    // Vehicle arrives at entry
    public void arrive(String vehicleNumber) {

        if (waitingQueue.size() == maxQueueSize) {
            System.out.println("❌ Queue Overflow! Vehicle " + vehicleNumber + " cannot enter");
            return;
        }

        waitingQueue.offer(vehicleNumber);
        System.out.println("🚗 Vehicle waiting: " + vehicleNumber);
    }

    // Allow one vehicle to enter roundabout
    public void enterRoundabout() {

        if (waitingQueue.isEmpty()) {
            System.out.println("⚠ Queue Underflow! No vehicle waiting");
            return;
        }

        String number = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }

        System.out.println("✅ Vehicle entered roundabout: " + number);
    }

    // Vehicle exits roundabout
    public void exitRoundabout(String number) {

        if (head == null) {
            System.out.println("No vehicles in roundabout");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = null;

        do {
            if (curr.number.equals(number)) {

                // Single vehicle
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // Removing head
                else if (curr == head) {
                    Vehicle last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // Middle vehicle
                else {
                    prev.next = curr.next;
                }

                System.out.println("🚘 Vehicle exited: " + number);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Vehicle not found in roundabout");
    }

    // Print roundabout state
    public void printRoundabout() {

        if (head == null) {
            System.out.println("🛑 Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("🔁 Roundabout: ");

        do {
            System.out.print(temp.number + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }
}

