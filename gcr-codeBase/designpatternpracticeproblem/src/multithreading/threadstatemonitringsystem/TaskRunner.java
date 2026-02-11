package multithreading.threadstatemonitringsystem;

public class TaskRunner extends Thread {

	public TaskRunner(String name) {
		super(name);
	}
	
	@Override
	 public void run() {
		
		try {
			
			System.out.println(getName() + "Started working..");
			
			
			Thread.sleep(2000);
			
			for(int i = 1; i <= 5; i++) {
				System.out.println(getName() + "computing" + i);
			}
			
			System.out.println(getName() + "finished work");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(getName() + "interuupted");
		}
	}
}
