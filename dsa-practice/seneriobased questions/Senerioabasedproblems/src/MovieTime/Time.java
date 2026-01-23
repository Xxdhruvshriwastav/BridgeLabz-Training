package MovieTime;

public class Time {

	public int hour;
	public int minute;
	public String ampm;
	public int totalMinutes;
	
	public Time(int hour, int minute, String ampm) {
		this.hour = hour;
		this.minute = minute;
		this.ampm = ampm;
		
		
		calculateMinutes();
	}
	
	public void calculateMinutes() {
		int h = hour;
		
		if (h == 12) {
			
			h = 0;
		}
		
		totalMinutes = h * 60 + minute;
		
		if(ampm.equalsIgnoreCase("PM")) {
			
			totalMinutes += 12 * 60;
		}
	}
	
	
	public String toString() {
		return hour + ":" + (minute < 10 ? "0" + minute : minute) + " " + ampm; 
	}
	
}
