package day1;

class RentalSystemMain {

    public static void main(String[] args) {

        Customer c1 = new Customer(101, "Ashish");

        Vehicle vehicles[] = {
            new Car("BR01A1234", "Hyundai Verna", 2500, 1200),
            new Bike("BR02B5678", "Honda Shine", 700),
            new Truck("BR03C9999", "Tata 709", 5000, 3000)
        };

        c1.showCustomer();

        System.out.println("\n--- Rental Summary (5 Days) ---");

        for (Vehicle v : vehicles) {

            v.showDetails();
            System.out.println("Rent for 5 days: " + v.calculateRent(5));
            System.out.println("----------------------");
        }
    }
}
