package reflection.timingframework;


public class TimingTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        MethodTimerProxy.execute(calculator);
    }
}
