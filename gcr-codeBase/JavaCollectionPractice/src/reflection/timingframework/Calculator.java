package reflection.timingframework;



public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {

        try {
            Thread.sleep(200); // simulate heavy logic
        } catch (Exception e) {}

        return a * b;
    }
}
