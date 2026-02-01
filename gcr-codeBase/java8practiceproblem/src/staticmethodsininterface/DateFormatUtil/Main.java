package staticmethodsininterface.DateFormatUtil;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		 LocalDate invoiceDate = LocalDate.now();

	        System.out.println("DD-MM-YYYY : " +
	                dateFormatUtil.formatDate(invoiceDate, "dd-MM-yyyy"));

	        System.out.println("YYYY/MM/DD : " +
	        		dateFormatUtil.formatDate(invoiceDate, "yyyy/MM/dd"));

	        System.out.println("Readable   : " +
	        		dateFormatUtil.formatDate(invoiceDate, "dd MMM yyyy"));

	        System.out.println("Full Date  : " +
	        		dateFormatUtil.formatDate(invoiceDate,
	                        "EEEE, dd MMMM yyyy"));
	    

		
	}
}
