
package reflection.MathOperations;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //  Load class
        Class<?> clazz = Class.forName("reflection.MathOperations.MathOperations");

        //  Create object dynamically
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // 3️⃣ Get method dynamically
        
        // one method name and two parameter thats why 2 int.class
        Method method = clazz.getMethod(
                methodName,
                int.class,
                int.class
        );

        //  Invoke method
        Object result = method.invoke(obj, a, b);

        //  Output
        System.out.println("Result = " + result);

        sc.close();
    }
}
