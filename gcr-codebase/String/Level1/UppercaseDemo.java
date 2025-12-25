import java.util.Scanner;

public class UppercaseDemo {

    public static String toUpperCaseCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                ch = (char) (ch - 32);
            result += ch;
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userUpper = toUpperCaseCharAt(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Match: " + compare(userUpper, builtInUpper));

        sc.close();
    }
}
