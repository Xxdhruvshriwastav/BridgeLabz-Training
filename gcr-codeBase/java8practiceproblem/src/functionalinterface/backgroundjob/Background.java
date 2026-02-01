package functionalinterface.backgroundjob;

public class Background {

	public static void main(String[] args) {
		 Runnable job = () -> {
	            System.out.println("Background task started...");

	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Processing step " + i);
	                // this is basically for delaying 
	                try {
	                    Thread.sleep(1000);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }

	            System.out.println("Background task finished!");
	        };

	        Thread t = new Thread(job);
	        t.start();

	        System.out.println("Main thread continues execution...");
	    
	}
	
}
