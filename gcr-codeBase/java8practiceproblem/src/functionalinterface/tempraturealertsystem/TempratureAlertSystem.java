package functionalinterface.tempraturealertsystem;

import java.util.function.Predicate;

public class TempratureAlertSystem {

	public static void main(String[] args) {
		
		Predicate<Double> tempratureAlert = 
				temp -> temp > 40;
				
				double [] temp = {
						
						32.5, 38.0, 45.0, 36.8,49.8
				};
				
				
				for(double tem : temp) {
					if (tempratureAlert.test(tem)) {
						System.out.println("Temprature is too high" +  " " + tem + "°C");
					} else {
						System.out.println("Temprature is normal" +  " " + tem + "°C");
					}
				}
	}
}
