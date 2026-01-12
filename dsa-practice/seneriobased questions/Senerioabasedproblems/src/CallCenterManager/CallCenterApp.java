package CallCenterManager;


public class CallCenterApp {

    public static void main(String[] args) {

        CallCenterManager manager = new CallCenterManager();

        Customer c1 = new Customer("C101", "Amit", false);
        Customer c2 = new Customer("C102", "Neha", true);
        Customer c3 = new Customer("C103", "Ravi", false);
        Customer c4 = new Customer("C102", "Neha", true);

        manager.receiveCall(c1);
        manager.receiveCall(c2);
        manager.receiveCall(c3);
        manager.receiveCall(c4);

        manager.handleCall();
        manager.handleCall();
        manager.handleCall();
        manager.handleCall();

        manager.displayCallCount();
    }
}
