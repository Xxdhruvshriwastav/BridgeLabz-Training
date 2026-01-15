package HospitalQueue;

public class HospitalQueue {

	public static void main (String [] args) {
		
		Patient [] patients = {
				
				new Patient("dhruv", 3),
				new Patient("Ravi Gautam", 2),
				new Patient("Ritesh", 6),
				new Patient("Shriyansh", 4),
				new Patient("Swaraj", 9),
				new Patient("ashish", 7),
				new Patient("himesh", 1),
				new Patient("ajit", 8),
				new Patient("neeraj", 5),
				new Patient("sunny", 3)
				
		};
		
		
		int n = patients.length;
		
		for (int i = 0; i < n -1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				
				if (patients[j].difficultyLevel >patients[j + 1].difficultyLevel) {
					
					Patient temp = patients[j];
					patients [j ] = patients[j + 1];
					patients[j + 1 ]  = temp;
					
				}
			}
		}
		
		for(Patient P : patients) {
			System.out.println (P.name + " and the difficulty level is" + " " + P.difficultyLevel);
		}
	}
}
