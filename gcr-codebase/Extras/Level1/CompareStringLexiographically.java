import java.util.Scanner;

public class CompareStringLexiographically {

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i); // return difference of first unmatched character
                                                    // the diff is based on ASCII value
            }
        }

        // If all characters matched, compare length
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println("Both strings are equal");
        }

        // Close the scanner object
        sc.close();
    }
}
