package implementinginterfaces.smartdevicecontrolinterface;

public class SmartHomeController {

	public static void main(String[] args) {
		
		SmartDevice light = new Light();
        SmartDevice ac = new Ac();
        

        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();

        
	}
}
