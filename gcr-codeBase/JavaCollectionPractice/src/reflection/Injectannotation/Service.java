package reflection.Injectannotation;



public class Service {

    @Inject
    private Repository repository;

    public void process() {
        repository.save();
    }
}
