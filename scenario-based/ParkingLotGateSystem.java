import java.util.Scanner;

public class ParkingLotGateSystem {

    public static void main(String[] args) {

        int capecity = 100; // total parking spots
        int parkVehicles = 0; // currently parked vehicles

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nParking Lot Gate System");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Check Available Spots");
            System.out.println("4. Exit System");
            System.out.print("Choose an option: ");

            int choise = sc.nextInt();

            switch (choise) {

                case 1: // enter car
                    if (parkVehicles < capecity) {
                        parkVehicles++;
                        System.out.println("Vehicle Entered. Current Parked Vehicles: " + parkVehicles);
                    } else {
                        System.out.println("Parking Lot Full! Entry Denied.");
                    }
                    break;

                case 2: // exit car
                    if (parkVehicles > 0) {
                        parkVehicles--;
                        System.out.println("Vehicle Exited. Current Parked Vehicles: " + parkVehicles);
                    } else {
                        System.out.println("No Vehicles to Exit!");
                    }
                    break;

                case 3: // check available spots

                    int availableSpots = capecity - parkVehicles;
                    System.out.println("Available Parking Spots: " + availableSpots);

                    break;

                case 4: // exit system

                    System.out.println(" Thank you");
                    System.exit(0);

                default:
                    System.out.println("Invalid, try again");

            }

        }

    }

}
