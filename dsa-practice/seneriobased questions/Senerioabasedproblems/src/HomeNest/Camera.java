package HomeNest;

public class Camera extends  DeviceBase {

	public String colour;
	
	
	public Camera(String deviceId, boolean status, double energyUsage, String colour) {
	   super(deviceId, status, energyUsage);
	   this.colour = colour;
}


	@Override
	public void reset() {
		
		status = !status;
		System.out.println("Light toggled" + status);
		
	}
	
	

}
