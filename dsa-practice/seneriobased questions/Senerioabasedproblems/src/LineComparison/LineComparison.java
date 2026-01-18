package LineComparison;

public class LineComparison {

    public static void compare(Line line1, Line line2) {

        double length1 = line1.getLength();
        double length2 = line2.getLength();

        System.out.println("Length of Line 1 = " + length1);
        System.out.println("Length of Line 2 = " + length2);

        if (length1 == length2) {
            System.out.println("Both lines are equal");
        } 
        else if (length1 > length2) {
            System.out.println("Line 1 is longer");
        } 
        else {
            System.out.println("Line 2 is longer");
        }
    }
}
