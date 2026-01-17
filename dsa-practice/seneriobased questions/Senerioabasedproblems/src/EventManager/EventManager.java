package EventManager;

public class EventManager {
	
	public static int partion(int [] arr ,int  low, int high) {
		
		int piviot = arr[high];
		int i = low -1;
		
			
			for (int j = low; j < high; j++) {
			
				if (arr[j] < piviot) {
				i++;
				
				int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
			}
		}
		
	int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

	return i+1;
}
	public static void quickSort( int [] arr ,int low, int  high) {
		
		if (low < high) {
			
			int piviotIndex = partion(arr, low, high);
			
			quickSort(arr, low, piviotIndex - 1);
			quickSort(arr, piviotIndex + 1, high);

		}
		
	}
	
	
	

	public static void main (String args []) {
		
		int ticketPrice [] = {600, 700, 1800, 200, 400, 900, 1000, 750, 1800, 1600, 3760, 150};
		int high = ticketPrice.length -1;
		int low = 0;
		
		quickSort(ticketPrice, low, high);
		
		 System.out.println("Sorted Ticket Prices:");
	        for (int price : ticketPrice) {
	            System.out.print(price + " ");
	        }
		
	        
	     System.out.println("Top five chepest ticket ticket ");
	     
	     for(int i = 0; i < 5; i++) {
	    	 
	    	 System.out.print(ticketPrice[i] + " ");
	    	 
	     }
	     
	     System.out.println("Top Five expensive ticket price is ");
	     for (int i = ticketPrice.length -1; i >= ticketPrice.length - 5; i-- ) {

	    	 System.out.print( ticketPrice[i] + " ");
	     }
	}

	
}
