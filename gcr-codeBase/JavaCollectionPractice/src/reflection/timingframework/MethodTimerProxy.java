package reflection.timingframework;


import java.lang.reflect.Method;

public class MethodTimerProxy {

    public static void execute(Object obj) {

        Class<?> clazz = obj.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            // only public methods
            if (!java.lang.reflect.Modifier.isPublic(method.getModifiers()))
                continue;

            try {
                Object[] parameters =
                        createDefaultParameters(method);

                long start = System.nanoTime();

                Object result =
                        method.invoke(obj, parameters);

                long end = System.nanoTime();

                System.out.println(
                        "Method " + method.getName()
                        + " executed in "
                        + (end - start) / 1_000_000.0
                        + " ms"
                );

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // create default values for parameters
    private static Object[] createDefaultParameters(Method method) {

        Class<?>[] types = method.getParameterTypes();
        Object[] params = new Object[types.length];

        for (int i = 0; i < types.length; i++) {

            if (types[i] == int.class) params[i] = 1;
            else if (types[i] == double.class) params[i] = 1.0;
            else if (types[i] == long.class) params[i] = 1L;
            else if (types[i] == boolean.class) params[i] = true;
            else params[i] = null;
        }

        return params;
    }
}
