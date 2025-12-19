import java.util.Scanner;

public class AgeHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // size of array of age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // Taking input from the user
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
        }

        // intialize
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output
       
        System.out.println("Youngest Friend " + names[youngestIndex]);
        System.out.println("Tallest Friend " + names[tallestIndex]);
    }
}
