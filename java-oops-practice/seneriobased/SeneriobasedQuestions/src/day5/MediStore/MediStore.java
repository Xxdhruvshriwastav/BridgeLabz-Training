package day5.MediStore;

public class MediStore {

	
	public static void main (String [] args) {
		Medicine m1 = new Tablet("Paracetamol", 2026, 10);
		Medicine m2 = new Syrup("Cough Syrup", 2024, 5);
		Medicine m3 = new Syrup("Insuline", 2023, 2);
		
		m1.sell();
		m2.sell();
		m3.sell();
	}
}
