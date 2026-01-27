package reflection.Injectannotation;



public class App {

    public static void main(String[] args) {

        Service service = DIContainer.getBean(Service.class);

        service.process();
    }
}
