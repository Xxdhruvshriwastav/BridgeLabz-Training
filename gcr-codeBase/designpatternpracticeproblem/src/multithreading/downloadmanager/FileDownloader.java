package multithreading.downloadmanager;
import java.util.Iterator;
import java.util.Random;

// using thread class approach

//public class FileDownloader extends Thread {
//
//	private String fileName;
//	
//	public FileDownloader(String fileName) {
//		this.fileName = fileName;
//	}
//	
//	@Override
//	public void run() {
//		Random random = new Random();
//		
//		for(int i = 0; i <= 100; i+=10) {
//			System.out.println("[" + Thread.currentThread().getName() + "]"
//			+ fileName + ": " + i + "%");
//			
//			try {
//				
//				Thread.sleep(random.nextInt(500));
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println(fileName+ "Download completed");
//	}
//}

public class FileDownloader implements Runnable {

	private String fileName;
	
	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void run() {
		
		Random random = new Random();
		
		for(int i = 0; i <= 100; i+=10) {
			System.out.println("[" + Thread.currentThread().getName() + "]"
			+ fileName + ": " + i + "%");
			
			try {
				
				Thread.sleep(random.nextInt(500));
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(fileName+ "Download completed");
	}
}

