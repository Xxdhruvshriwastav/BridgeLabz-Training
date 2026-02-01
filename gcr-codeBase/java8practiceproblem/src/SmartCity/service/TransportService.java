package SmartCity.service;

public interface TransportService {

	String getName();
	double getFare();
	String getTime();
	
	 default void printServiceDetails() {
	        System.out.println(
	                getName()
	                + " | Fare ₹" + getFare()
	                + " | Time " + getTime()
	        );
	}
	
}

