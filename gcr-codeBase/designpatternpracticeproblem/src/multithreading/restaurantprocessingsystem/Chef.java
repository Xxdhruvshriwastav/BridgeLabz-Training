package multithreading.restaurantprocessingsystem;


public class Chef implements Runnable {
	private String name;
	private String dish;
	private int time;
	
	public Chef(String name, String dish, int time) {
		this.name = name;
		this.dish = dish;
		this.time = time;
	}
	
	
	@Override
	public void run() {
		
		System.out.println(name + "preparing" + dish);
		
		try {
			
			for(int i = 25; i <= 100; i+=25) {
				Thread.sleep(time/4);
				System.out.println(name + "preparing" + dish + ":" + i + "% complete");
			}
			
			System.out.println(name + "completed" + dish);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Kitchen closed - All orders completed");
		
	}

	
}
