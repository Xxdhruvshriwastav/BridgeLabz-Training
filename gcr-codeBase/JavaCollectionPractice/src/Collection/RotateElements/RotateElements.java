package Collection.RotateElements;
import java.util.*;

public class RotateElements {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position where you want to rotate the array");
		int pos = sc.nextInt();

	        for (int i = 0; i < pos; i++) {
	            int first = l.get(0);
	            l.remove(0);
	            l.add(first);
	        }
		
		System.out.println(l);
		sc.close();
	}
}
