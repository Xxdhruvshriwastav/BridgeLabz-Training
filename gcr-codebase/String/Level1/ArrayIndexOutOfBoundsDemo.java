public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        String[] names = { "A", "B", "C" };

        // generateException(names);
        handleException(names);
    }
}
