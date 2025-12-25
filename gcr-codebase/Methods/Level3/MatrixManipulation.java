import java.util.Random;

public class MatrixManipulation {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(9) + 1; // 1 to 9 they are present in util p
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null)
            return;

        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }

    // Method to find transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return null;
        }

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);

        if (det == 0) {
            System.out.println("Inverse not possible (Determinant = 0)");
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / det;
        inv[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;

        inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / det;
        inv[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / det;

        inv[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / det;
        inv[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / det;

        return inv;
    }

    // Main method
    public static void main(String[] args) {

        // 2x2 Matrix
        double[][] matrix2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix2));

        System.out.println("\nDeterminant (2x2): " + determinant2x2(matrix2));

        System.out.println("\nInverse (2x2):");
        displayMatrix(inverse2x2(matrix2));

        // 3x3 Matrix
        double[][] matrix3 = createRandomMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix3));

        System.out.println("\nDeterminant (3x3): " + determinant3x3(matrix3));

        System.out.println("\nInverse (3x3):");
        displayMatrix(inverse3x3(matrix3));
    }
}
