package HomeNest;

public abstract class DeviceBase implements IControllable {

	private String deviceId;
	protected boolean status;
	private double energyUsage;
	
	
	public DeviceBase(String deviceId, boolean status, double energyUsage  ) {
		
		this.deviceId = deviceId;
		this.status = false;
		this.energyUsage = 0.0;
	}
	
	
	public void turnOn() {
		
		status = true;
		System.out.println(deviceId  + "On");
		
	}
	
	 public void turnOff() {
		 
		 status = false;
			System.out.println(deviceId  + "Off");
		 
	 }
	
	
	public String getDeviceId() {
		return deviceId;
	}
	
	
	
	public double getEnergyUsage() {
		return energyUsage;
	}
}
