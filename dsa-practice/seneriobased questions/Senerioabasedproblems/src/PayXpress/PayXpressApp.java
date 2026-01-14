package PayXpress;

public class PayXpressApp {

    public static void main(String[] args) {

        // Polymorphism
        Bill bill1 = new ElectricityBill(1200, "15-Jan");
        Bill bill2 = new InternetBill(800, "18-Jan");
        Bill bill3 = new WaterBill(500, "20-Jan");

        bill1.sendReminder();
        bill1.pay();

        bill2.sendReminder();
        bill2.pay();

        bill3.sendReminder();
        bill3.pay();

        // Encapsulation check
        System.out.println("Electricity bill paid? " + bill1.isPaid());
    }
}
