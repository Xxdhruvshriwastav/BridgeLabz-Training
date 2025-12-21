public class UnitConvertor {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
	
	
	// main method 
	
	public static void main(String[] args) {

        System.out.println("10 Km to Miles: " + UnitConvertor.convertKmToMiles(10));
        System.out.println("5 Miles to Km: " + UnitConvertor.convertMilesToKm(5));
        System.out.println("3 Meters to Feet: " + UnitConvertor.convertMetersToFeet(3));
        System.out.println("10 Feet to Meters: " + UnitConvertor.convertFeetToMeters(10));
    }
}
