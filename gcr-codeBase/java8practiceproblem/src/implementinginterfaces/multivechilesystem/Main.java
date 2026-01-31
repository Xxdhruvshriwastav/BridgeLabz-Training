package implementinginterfaces.multivechilesystem;

public class Main {

	public static void main(String[] args) {
		
		rentalSystem Bike = new Bike();
		
		Bike.rent();
		Bike.returnVehicle();
		
		
		System.out.println("");
		rentalSystem Car = new Car();
		Car.rent();
		Car.returnVehicle();
		
		System.out.println("");
		rentalSystem buses = new buses();
		buses.rent();
		buses.returnVehicle();
		
	}
}
