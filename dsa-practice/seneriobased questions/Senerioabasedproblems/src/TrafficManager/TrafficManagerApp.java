package TrafficManager;

public class TrafficManagerApp {

    public static void main(String[] args) {

        TrafficCircle traffic = new TrafficCircle();

        traffic.arrive("CAR-101");
        traffic.arrive("CAR-102");
        traffic.arrive("CAR-103");

        traffic.enterRoundabout();
        traffic.enterRoundabout();
        traffic.enterRoundabout();

        traffic.printRoundabout();

        traffic.exitRoundabout("CAR-102");

        traffic.printRoundabout();

        traffic.arrive("CAR-104");
        traffic.arrive("CAR-105");
        traffic.arrive("CAR-106");
        traffic.arrive("CAR-107"); // overflow case

        traffic.enterRoundabout();
        traffic.printRoundabout();
    }
}
