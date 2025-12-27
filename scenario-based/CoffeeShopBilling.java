import java.util.Scanner;

public class CoffeeShopBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.18; // 18% GST

        while (true) {

            System.out.println("\nEnter coffee type (espresso / latte / cappuccino) or type 'exit' to stop:");
            String coffeeType = sc.next().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Cafe closed. Thank you!");
                break;
            }

            double price = 0;

            switch (coffeeType) {

                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 170;
                    break;

                default:
                    System.out.println("Invalid coffee type! Try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            // bill calculation using arithmetic operators
            double total = price * qty;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + qty);
            System.out.println("Base Amount : ₹" + total);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Total Bill  : ₹" + finalBill);
            System.out.println("----------------\n");
        }

        sc.close();
    }
}
