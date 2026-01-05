import java.util.Scanner;

public class TrainReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;
        int bookSeats = 0;

        String choise;

        while (true) {

            System.out.println("Enter your chois to Book or not ");
            choise = sc.nextLine();

            if (choise.equalsIgnoreCase("book")) {
                bookSeats++;
                totalSeats--;
            } else {
                System.out.println("Thank you visit again");

            }

            if (totalSeats == 0) {
                System.out.println("No seats available");
                break;
            }

            System.out.println("Cureent booked seats no are " + " " + bookSeats);

        }
        sc.close();
    }
}
