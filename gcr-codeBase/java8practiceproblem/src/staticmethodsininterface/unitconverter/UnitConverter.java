package staticmethodsininterface.unitconverter;

public interface UnitConverter {
 
	public static void convertToMile(double km) {
	
		double mile = km * 0.621371;
		
		System.out.println("the distance in  ile is " + " " + mile);

	}
	
	public static void convertToLbs(double kg) {
		
		double lbs = kg * 2.20462;

		
		System.out.println("the weight in  ile is " + " " + lbs);

	}
}
