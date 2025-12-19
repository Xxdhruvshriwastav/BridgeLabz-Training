import java.util.Scanner;

public class TwoDToOneDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking row and column input
        System.out.println("enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("enter number of columns:");
        int cols = sc.nextInt();

        // Creating 2D array
        int[][] arr2D = new int[rows][cols];

        // Taking elements input from the user 
        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        // Creating 1D array
        int[] arr1D = new int[rows * cols];
        int index = 0;

        // Copying 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1D[index] = arr2D[i][j];
                index++;
            }
        }


        // Printing 1D array
        System.out.println(" printing an array:");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
        
		// closing an array object
        sc.close();
    }
}
