import java.util.Scanner;

public class MobileOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Mobile Operator, it should be Airtel, jio or vi");
        String arr = sc.nextLine().toLowerCase();

        switch (arr) {
            case "airtel":

                System.out.println("Welcome to Airtel, there are multiple options");
                System.out.println("1>  399 plan with benifits of 2GB/day + unlimited 5G with validity of 28 days");
                System.out.println("2>  349 plan with benifits of 1.5GB/day + unlimited 5G with validity of 28 days");

                break;
            case "jio":

                System.out.println("Welcome to Jio, there are multiple options");
                System.out.println("1>  349 plan with benifits of 2GB/day + unlimited 5G with validity of 28 days");
                System.out.println("2>  299 plan with benifits of 1.5GB/day + unlimited 5G with validity of 28 days");

                break;

            case "vi":
                System.out.println("Welcome to Jio, there are multiple options");
                System.out.println("1>  399 plan with benifits of 2GB/day + unlimited 5G with validity of 28 days");
                System.out.println("2>  299 plan with benifits of 1.5GB/day + unlimited 4G with validity of 28 days");
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
