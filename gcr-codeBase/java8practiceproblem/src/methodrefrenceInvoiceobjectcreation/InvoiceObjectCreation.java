package methodrefrenceInvoiceobjectcreation;

import java.util.List;

public class InvoiceObjectCreation {

	public static void main(String[] args) {
		
		List<Integer> ls = List.of(
				102,
				103,
				104,
				106,
				107
				
				);
		
		ls.stream()
		.map(Invoice:: new)
		.forEach(System.out::println);
		
	}
}
