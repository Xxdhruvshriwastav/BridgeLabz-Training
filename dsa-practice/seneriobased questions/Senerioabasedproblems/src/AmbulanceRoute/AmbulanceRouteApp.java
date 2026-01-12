package AmbulanceRoute;


public class AmbulanceRouteApp {

    public static void main(String[] args) {

        CircularHospitalRoute route = new CircularHospitalRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayUnits();

        route.findAvailableUnit();

        route.removeUnit("Surgery");

        route.displayUnits();

        route.findAvailableUnit();
    }
}
