package reflection.LoggingProxy;



public class ProxyTest {

    public static void main(String[] args) {

        Greeting target = new GreetingImpl();

        Greeting proxy =
                (Greeting) LoggingProxy.createProxy(target);

        proxy.sayHello("Ashish");
    }
}
