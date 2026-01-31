package implementinginterfaces.smartdevicecontrolinterface;

public class Ac implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Ac started cooling");
		
	}

	
	@Override
	public void turnOff() {
		System.out.println("Ac turned Off");
		
	}

}
