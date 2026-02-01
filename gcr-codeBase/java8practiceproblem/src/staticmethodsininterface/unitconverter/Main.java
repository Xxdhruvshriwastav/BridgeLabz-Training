package staticmethodsininterface.unitconverter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the value of Kg");
		UnitConverter.convertToLbs(sc.nextDouble());
		
		System.out.println("Enetr the value of Km");
		UnitConverter.convertToMile(sc.nextDouble());
		
	}
}
