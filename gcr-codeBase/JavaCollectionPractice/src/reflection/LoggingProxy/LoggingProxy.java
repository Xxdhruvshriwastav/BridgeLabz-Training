package reflection.LoggingProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxy {

    // create proxy object
    public static Object createProxy(Object target) {

        return Proxy.newProxyInstance(

                // class loader
                target.getClass().getClassLoader(),

                // interfaces implemented by target
                target.getClass().getInterfaces(),

                // invocation handler
                new InvocationHandler() {

                    @Override
                    public Object invoke(
                            Object proxy,
                            Method method,
                            Object[] args) throws Throwable {

                        // logging before method call
                        System.out.println(
                                "Calling method: " + method.getName()
                        );

                        // actual method execution
                        return method.invoke(target, args);
                    }
                }
        );
    }
}
