package HomeNest;

import java.util.*;

public class User {
	
	
	// String store id , device base store devices
	private Map<String, DeviceBase> devices = new HashMap<>();

	// user when register device
	
	public void registerDevice(DeviceBase device) {
		devices.put( device.getDeviceId(), device);
		System.out.println("Registered" + device.getDeviceId());
	}
	
	public void resetDevice(String deviceId) {
		DeviceBase d = devices.get(deviceId);
		if (d != null) {
			d.reset(); 
		} else {
			System.out.println("Device not found");
		}
	}
	
	public void turnOn(String deviceId) {
		DeviceBase d = devices.get(deviceId);
		if (d != null) d.turnOn();
		
	}
	
	public void turnOff(String deviceId) {
		DeviceBase d = devices.get(deviceId);
		if (d != null) d.turnOff();
	}
}
