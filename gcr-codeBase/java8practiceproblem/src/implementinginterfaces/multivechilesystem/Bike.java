package implementinginterfaces.multivechilesystem;

public class Bike implements rentalSystem {

	@Override
	public void rent() {
		System.out.println("bike is assigned for rent");
		
	}

	@Override
	public void returnVehicle() {
		System.out.println("Bike has returned ");
		
	}

}
