import java.util.Random;

public class RectangularMatrixDemoo {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(9) + 1; // 1 to 9
            }
        }
        return matrix;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Check multiplication condition
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible!");
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        if (matrix == null) return;

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Matrix A → 2 × 3
        int[][] A = createRandomMatrix(2, 3);

        // Matrix B → 3 × 2
        int[][] B = createRandomMatrix(3, 2);

        System.out.println("Matrix A (2 x 3):");
        displayMatrix(A);

        System.out.println("\nMatrix B (3 x 2):");
        displayMatrix(B);

        // AB → (2 x 2)
        System.out.println("\nProduct AB (2 x 2):");
        int[][] AB = multiplyMatrices(A, B);
        displayMatrix(AB);

        // BA → (3 x 3)
        System.out.println("\nProduct BA (3 x 3):");
        int[][] BA = multiplyMatrices(B, A);
        displayMatrix(BA);
    }
}
