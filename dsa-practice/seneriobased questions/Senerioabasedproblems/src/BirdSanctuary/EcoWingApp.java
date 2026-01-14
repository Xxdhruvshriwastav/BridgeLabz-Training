package BirdSanctuary;

import java.util.Scanner;

public class EcoWingApp {

    public static void main(String[] args) {

        Sanctuary sanctuary = new Sanctuary();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.println("Choose Bird Type:");
                    System.out.println("1.Eagle 2.Sparrow 3.Duck 4.Penguin 5.Seagull 6.Ostrich");
                    int type = sc.nextInt();

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    Bird bird = switch (type) {
                        case 1 -> new Eagle(id, name);
                        case 2 -> new Sparrow(id, name);
                        case 3 -> new Duck(id, name);
                        case 4 -> new Penguin(id, name);
                        case 5 -> new Seagull(id, name);
                        case 6 -> new Ostrich(id, name);
                        default -> null;
                    };

                    if (bird != null) sanctuary.addBird(bird);
                }

                case 2 -> sanctuary.displayAllBirds();
                case 3 -> sanctuary.displayFlyingBirds();
                case 4 -> sanctuary.displaySwimmingBirds();
                case 5 -> sanctuary.displayBoth();
                case 6 -> {
                    System.out.print("Enter Bird ID: ");
                    sanctuary.removeBird(sc.nextInt());
                }
                case 7 -> sanctuary.report();
                case 8 -> System.exit(0);
            }
        }
    }
}
