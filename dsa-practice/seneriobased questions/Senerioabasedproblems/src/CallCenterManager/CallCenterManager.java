package CallCenterManager;
import java.util.*;



public class CallCenterManager {

    // Normal customer queue
    private Queue<Customer> normalQueue;

    // VIP customer priority queue
    private PriorityQueue<Customer> vipQueue;

    // Customer call count
    private HashMap<String, Integer> callCountMap;

    public CallCenterManager() {

        normalQueue = new LinkedList<>();

        vipQueue = new PriorityQueue<>(
            (c1, c2) -> c1.name.compareTo(c2.name)
        );

        callCountMap = new HashMap<>();
    }

    // Incoming call
    public void receiveCall(Customer customer) {

        // Update call count
        callCountMap.put(
            customer.customerId,
            callCountMap.getOrDefault(customer.customerId, 0) + 1
        );

        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("📞 VIP Call received from: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("📞 Normal Call received from: " + customer.name);
        }
    }

    // Handle next call
    public void handleCall() {

        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("✅ Handling VIP customer: " + customer.name);
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("✅ Handling Normal customer: " + customer.name);
        } else {
            System.out.println("❌ No calls in queue");
            return;
        }
    }

    // Display call count
    public void displayCallCount() {

        System.out.println("\n📊 Customer Call Count This Month:");
        for (String id : callCountMap.keySet()) {
            System.out.println(
                "Customer ID: " + id + " → Calls: " + callCountMap.get(id)
            );
        }
    }
}

