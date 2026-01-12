package TrainCompanion;


public class TrainCompanionApp {

    public static void main(String[] args) {

        TrainRoute train = new TrainRoute();

        train.addCompartment("C1", "Normal");
        train.addCompartment("C2", "WiFi");
        train.addCompartment("Pantry", "Pantry");
        train.addCompartment("C3", "Normal");

        train.traverseForward();
        train.traverseBackward();

        train.searchService("Pantry");
        train.searchService("WiFi");

        train.showAdjacent("Pantry");

        train.removeCompartment("C2");

        train.traverseForward();
    }
}
