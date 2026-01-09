package day5.TourMate;

public class TourMate {
	 public static void main(String[] args) {

	        Trip t1 = new DomesticTrip("Manali", 5);
	        Trip t2 = new InternationalTrip("Dubai", 7);

	        t1.book();
	        System.out.println();
	        t2.book();
	    }
}
