import java.util.Scanner;

public class FactorProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a number");
        int number = sc.nextInt();

       
        int arr [] = new int [number];
		int index = 0;	

        for (int i = 1; i <= number+1; i++) {

            if (number % i == 0) {
               arr[index] = i;
			   index++;
            } 
        }

        // Printing Factors
        System.out.println("Factor  Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        // closing the Scanner object

        sc.close();
    }
}
