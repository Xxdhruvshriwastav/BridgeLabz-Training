package multithreading.threadstatemonitringsystem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StateMonitor extends Thread {

	private Thread t1;
	private Thread t2;
	
	public StateMonitor(Thread t1, Thread t2) {
		this.t1 = t1;
		this.t2 = t2;
		
		
	}
	
	public void run() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		boolean running = true;
		
		while(running) {
			
			String time = LocalTime.now().format(formatter);
			
			System.out.println("[Monitor]" +
			
					t1.getName() + "->"
				+   t1.getState() + "at"
					+ time	
					);
			
			 System.out.println("[Monitor] "
	                    + t2.getName() + " → "
	                    + t2.getState() + " at " + time);
			 
			 
			 if (t1.getState() == Thread.State.TERMINATED
	                    && t2.getState() == Thread.State.TERMINATED) {
	                running = false;
	            }
			 
			 try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                System.out.println("Monitor interrupted.");
	            }
	        }

	        System.out.println("\nMonitoring Finished!");
		}
	}
	

