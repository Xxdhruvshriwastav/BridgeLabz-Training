package implementinginterfaces.multivechilesystem;

public class Car implements rentalSystem {

	@Override
	public void rent() {
		
		System.out.println("Car is Assigned for rent");
		
	}

	@Override
	public void returnVehicle() {
		
		System.out.println("Car is returned bu user");
	}

	
}
