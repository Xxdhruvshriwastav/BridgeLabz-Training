import java.util.Scanner;

public class HeightAndAge {

   public static void heightAmongThree(int [] arr, Scanner sc) {
     
		for (int i =0;  i < arr.length; i++ ) {
	   
	     System.out.println("enter the height of " + (i+1) + "Student");
	   
         arr[i] = sc.nextInt();
		 
	
		
		}
		
		if (arr[0] > arr[1] && arr[0] > arr[2]) {
		
		System.out.println("The Height of " + arr[0] + "is more among all");
		} else if (arr[1] > arr[0] && arr[1] > arr[2]) {
		
		System.out.println("The Height of " + arr[1] + "is more among all");
		} else {
		System.out.println("The Height of " + arr[2] + "is more among all");
		}
   }
   
   
   
   public static void  ageAmongThree(int [] arr2, Scanner sc ) {
	
	for (int i =0;  i < arr2.length; i++ ) {
	   
	     System.out.println("enter the height of " + (i+1) + "Student");
	   
         arr2[i] = sc.nextInt();
		 
	
		
		}
		
		if (arr2[0] > arr2[1] && arr2[0] > arr2[2]) {
		
		System.out.println("The age of " + arr2[0] + "is more among all");
		} else if (arr2[1] > arr2[0] && arr2[1] > arr2[2]) {
		
		System.out.println("The age of " + arr2[1] + "is more among all");
		} else {
		
		System.out.println("The age of " + arr2[2] + "is more among all");
		}
		
   }
   
        // main method 

        public static void main (String args []) {
	
	    Scanner sc = new Scanner(System.in);
		
 
         int[] arr = new int[3];
		 int[] arr2 = new int[3];
		 
            
			
		heightAmongThree( arr, sc);
			
		ageAmongThree(arr2, sc);
		
        sc.close();
    }
	
}