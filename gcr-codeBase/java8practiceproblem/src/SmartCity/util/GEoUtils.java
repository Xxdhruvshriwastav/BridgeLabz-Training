package SmartCity.util;

public class GEoUtils {

	 public static double calculateDistance(
	            double a, double b,
	            double c, double d) {

	        return Math.abs(a - c) + Math.abs(b - d);
	    }
}
