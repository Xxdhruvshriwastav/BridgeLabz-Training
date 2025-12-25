import java.util.Scanner;

public class RemoveSpecificCharacter {

    // Method to remove a specific character
    public static String removeCharacter(String str, char removeChar) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != removeChar) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String output = removeCharacter(input, ch);

        System.out.println("Modified String: \"" + output + "\"");

        // Close the scanner object
        sc.close();
    }
}
