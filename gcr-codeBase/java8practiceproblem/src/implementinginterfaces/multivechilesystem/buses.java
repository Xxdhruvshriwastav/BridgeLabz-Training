package implementinginterfaces.multivechilesystem;

public class buses implements rentalSystem {

	@Override
	public void rent() {
		System.out.println("Busses are assigned for rent");
		
	}

	@Override
	public void returnVehicle() {
		System.out.println("buses are returend back");
		
	}

}
