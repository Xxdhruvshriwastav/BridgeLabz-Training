import java.util.*;

public class RemoveDuplicates {

    public static String removeDuplicates(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // check if character already exists
			
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String output = removeDuplicates(s);
        System.out.println("String after removing duplicates: " + output);

        sc.close();
    }
}
