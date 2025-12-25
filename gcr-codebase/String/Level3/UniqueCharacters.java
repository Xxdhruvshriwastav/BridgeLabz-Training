import java.util.Scanner;

public class UniqueCharacters {

    // Find string length without using length()
    public static int stringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return length;
    }

    // Find unique characters
    public static char[] uniqueCharacters(String text) {
        int len = stringLength(text);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count++] = c;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : unique)
            System.out.print(c + " ");
        sc.close();
    }
}
