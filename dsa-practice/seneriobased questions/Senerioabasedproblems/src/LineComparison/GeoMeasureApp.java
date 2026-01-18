package LineComparison;

import java.util.Scanner;

public class GeoMeasureApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Line 1
        System.out.println("Enter Line 1 coordinates (x1 y1 x2 y2):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Line line1 = new Line(x1, y1, x2, y2);

        // Input Line 2
        System.out.println("Enter Line 2 coordinates (x1 y1 x2 y2):");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();

        Line line2 = new Line(a1, b1, a2, b2);

        // Comparison
        LineComparison.compare(line1, line2);

        sc.close();
    }
}
