import java.util.Scanner;

public class AttendenceSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = { "Ashish", "Dhruv", "vedansh", "Nageshwar", "Ravi", "Ajit", "Neeraj", "Shriyansh", "Rohit",
                "Rudra" };
        int present = 0;

        for (String students : arr) {

            System.out.println(students + " is Present or Absent");
            String status = sc.nextLine();

            if (status.equalsIgnoreCase("present")) {
                present++;
            }

        }

        System.out.println("The total no of present student is " + " " + present);
        System.out.println("The total no of absent student is " + (arr.length - present));

        sc.close();
    }
}
