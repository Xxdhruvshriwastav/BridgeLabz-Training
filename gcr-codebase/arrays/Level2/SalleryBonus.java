import java.util.Scanner;

    public class SalleryBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the sallery");
        double salary = sc.nextDouble();

        System.out.println("enter the year");
        int service = sc.nextInt();

        double bonus;

        if (service > 5) {
			// for 5% bonus
            bonus = salary * 0.05;   
        } else {
			
			// for 2% bonus
            bonus = salary * 0.02;
        }

        double newSalary = salary + bonus;

        System.out.println("Bonus = " + bonus);
        System.out.println("New Salary = " + newSalary);
    }
}
