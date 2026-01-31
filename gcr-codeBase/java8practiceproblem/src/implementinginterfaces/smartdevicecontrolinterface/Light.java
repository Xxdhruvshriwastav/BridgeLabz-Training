package implementinginterfaces.smartdevicecontrolinterface;

public class Light implements SmartDevice {

	@Override
	public void turnOn() {
		
		System.out.println("Light Turned On");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("Light Turned Off");
		
	}
	
}
