package methodrefrencehospitalprintingid;

import java.util.List;

public class HospitalPatientIDPrinting {
public static void main(String[] args) {
	

	
	List<Patient> patitents = List.of(
			new Patient("Ashis", 101 ),
			new Patient("Ravi", 105 ),
			new Patient("Shriyansh", 104 ),
			new Patient("Swaraj", 109 )
			
			);
	
	   System.out.println("Patient IDs:\n");
	
	   patitents.stream()
	   .map(Patient:: getId)
	   .forEach(System.out::println);

	
	
	    
} 

}
