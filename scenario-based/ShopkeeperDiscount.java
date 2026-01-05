import java.util.Scanner;

public class ShopkeeperDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of items");
        int item = sc.nextInt();

        double totalPrice = 0;

        // ccalculate the total price
        for (int i = 1; i <= item; i++) {

            System.out.println("Enter the price of item" + i);
            double price = sc.nextDouble();

            totalPrice += price;

        }

        double totalPriceAfterDiscount = totalPrice * 0.9; // 10 % discount
        System.out.println("The Total amount after 10% discount is " + totalPriceAfterDiscount);

        // closing the scanner object
        sc.close();
    }
}
