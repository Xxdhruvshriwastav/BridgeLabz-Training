import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cardBalance = 200; // initial balance

        while (cardBalance > 0) {

            System.out.println("\nCurrent Balance: ₹" + cardBalance);
            System.out.print("Enter distance (km) or -1 to exit: ");
            double distance = sc.nextDouble();

            if (distance == -1) {
                System.out.println("Journey Ended. Thank you!");
                break;
            }

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 20 : (distance <= 10) ? 30 : 40;

            if (fare > cardBalance) {
                System.out.println(" Insufficient Balance! Recharge required.");
                break;
            }

            cardBalance -= fare;

            System.out.println("Fare Deducted: ₹" + fare);
            System.out.println("Remaining Balance: ₹" + cardBalance);
        }

        System.out.println("Smart Card balance exhausted / session ended.");
        sc.close();
    }
}
