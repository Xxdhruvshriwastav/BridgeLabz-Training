package HomeNest;

public class HomeNest {

	public static void main(String [] args) {
		User u1 = new User();
		
		DeviceBase light  = new Light("L102", false, 0, "Blue");
        DeviceBase camera = new Camera("U202", false, 0, "Black");
        
        u1.registerDevice(light);
        u1.registerDevice(camera);
		
		u1.turnOn("L102");
		u1.turnOff("L102");
		u1.resetDevice("L102");
		
		u1.turnOn("U202");
		u1.turnOff("U202");
		u1.resetDevice("U202");
		
		
	}
}
