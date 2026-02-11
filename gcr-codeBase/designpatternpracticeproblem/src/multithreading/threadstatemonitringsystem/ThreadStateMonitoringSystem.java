package multithreading.threadstatemonitringsystem;

public class ThreadStateMonitoringSystem {

	public static void main(String[] args) {
		TaskRunner task1 = new TaskRunner("Task-1");
		TaskRunner task2 = new TaskRunner("Task-2");
		
		System.out.println(task1.getName() + "state" + task1.getState());
		System.out.println(task2.getName() + "state" + task2.getState());
		
		task1.start();
		task2.start();
		
		StateMonitor monitor = new StateMonitor(task1, task2);
		monitor.start();
		
	}
}
