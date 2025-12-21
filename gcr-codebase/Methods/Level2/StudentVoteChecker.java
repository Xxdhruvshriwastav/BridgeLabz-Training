import java.util.Scanner;

public class StudentVoteChecker {

public static boolean canStudentVote(int arr) {

		  if (arr < 0) {
            return false;
        }
		
       // check the condition
	   
       if (arr >= 18  ) {
	   return true;
	   
	   }else {
	   
	   return false;
	   
	   }
   }
// main method 

public static void main (String args []) {
	
	    Scanner sc = new Scanner(System.in);
		
 
         int[] arr = new int[10];
 
         for (int i =0;  i < arr.length; i++ ) {
	   
	     System.out.println("enter the age of " + (i+1) + "Student");
	   
         arr[i] = sc.nextInt();
		
		 boolean canVote = canStudentVote(arr[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote");
            } 
			
		 }
		 
		sc.close();
 
    }
	
}