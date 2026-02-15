package multithreading.downloadmanager;

public class DownloadManagerThread {

//	public static void main(String[] args) {
//		
//		FileDownloader file1 = new FileDownloader("img.jpg");
//		FileDownloader file2 = new FileDownloader("vid.m4");
//		FileDownloader file3 = new FileDownloader("Document.pdf");
//		
//		file1.start();
//		file2.start();
//		file3.start();
//		
//		try {
//			file1.join();
//			file2.join();
//			file3.join();
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("All downloads complete!");
//	}
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new FileDownloader("Document.pdf"));
		Thread t2 = new Thread(new FileDownloader("vid.m4"));
		Thread t3 = new Thread(new FileDownloader("Document.png"));
		
		t1.start();
		t2.start();
		t3.start();
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("All downloads completed");
		
	}
}
