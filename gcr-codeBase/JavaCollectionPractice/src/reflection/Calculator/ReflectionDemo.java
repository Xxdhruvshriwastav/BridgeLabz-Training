package reflection.Calculator;

import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        // Object create
        Calculator calculator = new Calculator();

        // Get Class object
        Class<?> calculatorClass = calculator.getClass();

        // Get private method
        Method method = calculatorClass.getDeclaredMethod(
                "multiply",
                int.class,
                int.class
        );

        //  Remove private restriction
        method.setAccessible(true);

        //  Invoke private method
        Object result = method.invoke(calculator, 5, 4);

        //  Print result
        System.out.println("Result = " + result);
    }
}
