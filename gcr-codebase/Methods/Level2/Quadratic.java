import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Case 1: delta > 0 (two real roots)
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        // Case 2: delta == 0 (one real root)
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // Case 3: delta < 0 (no real roots)
        else {
            return new double[0]; // empty array
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two real roots:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } 
        else if (roots.length == 1) {
            System.out.println("One real root:");
            System.out.println("Root = " + roots[0]);
        } 
        else {
            System.out.println("No real roots exist");
        }

        sc.close();
    }
}
