import java.util.Scanner;

public class CompareAndGetArray {

    // User-defined method to get characters using charAt()
    public static char[] getCharacters(String s1) {

        char[] chars = new char[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            chars[i] = s1.charAt(i);
        }

        return chars;
    }
    

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a text: ");
        String text = sc.next();

        // User-defined method
        char[] userChars = getCharacters(text);

        // Built-in method
        char[] builtInChars = text.toCharArray();

        // Compare results
        boolean result = compareCharArrays(userChars, builtInChars);

        // Display characters
        System.out.print("Characters using charAt(): ");
        for (char c : userChars) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        // Display comparison result
        if (result) {
            System.out.println("\nBoth character arrays are equal");
        } else {
            System.out.println("\nBoth character arrays are NOT equal");
        }

        sc.close();
    }
}
