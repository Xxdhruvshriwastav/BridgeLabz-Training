import java.util.Scanner;

public class TempratureLogger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTemp = 0;
        for (int day = 1; day <= 7; day++) {
            System.out.println("Enter the temperature of day " + day);
            double temp = sc.nextDouble();
            totalTemp += temp;

        }

        double avgTemp = totalTemp / 7.0;
        System.out.println("The average Temperature of 7 days is :" + " " + avgTemp);

        sc.close();
    }
}
