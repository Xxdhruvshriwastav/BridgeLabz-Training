package day1;

class HospitalUtils {

    public static boolean validateUserInput(String name, int id) {
        return name != null && !name.isEmpty() && id > 0;
    }

    public static void showPaymentDetails(Payable bill) {
        System.out.println("Final Bill Amount: " + bill.calculatePayment());
    }
}

