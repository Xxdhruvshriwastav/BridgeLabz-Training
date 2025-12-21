import java.util.Scanner;

public class BMICalculatorr {

    public static void bMI(double [] [] arr ) {
	
	
	for (int i =0; i < arr.length; i ++) {
	
	double weight = arr[i][0];
	double height = arr[i][1];
	
	
	double heightMeter = height / 100;
	double bmi = weight/(heightMeter * heightMeter);
	
	arr [i][2] = bmi;
	
	
	
	}
	
	    }
		
		
		
	public static String [] bmiStatus(double [] [] arr ) {
	
	String[] status = new String[arr.length];

	for (int i = 0; i < arr.length; i ++) {
		

	 double bmi = arr[i][2];

	 if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
	
	}	
	
	
	return status;
	
	
	
}	

    
    public static void main (String args []) {
		
	Scanner sc = new Scanner(System.in);
	
	double[][] arr = new double[10][3];

	
	for (int i =0; i < arr.length; i ++) {
	
	System.out.println("Enter the details of person " + (i + 1));
	
	System.out.println("Enter the weight" );
	 arr[i][0] = sc.nextDouble();
	System.out.println("Enter the height" );
	arr[i][1] = sc.nextDouble();

	
	}
	
	bMI(arr );
	String [] statuss = bmiStatus(arr );
	
	for (int i = 0; i < arr.length; i++) {
	
	System.out.println("BMI status of " + (i +1) + " " + " person is " + statuss[i]);
	
	}
	

        sc.close();
    }
}
