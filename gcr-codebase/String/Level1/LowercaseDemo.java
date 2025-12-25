import java.util.Scanner;

public class LowercaseDemo {

    public static String toLowerCaseCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch + 32);
            result += ch;
        }
        return result;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userLower = toLowerCaseCharAt(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Match: " + userLower.equals(builtInLower));

        sc.close();
    }
}
