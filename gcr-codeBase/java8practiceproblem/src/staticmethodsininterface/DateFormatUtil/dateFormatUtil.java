package staticmethodsininterface.DateFormatUtil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface dateFormatUtil {

	public static String formatDate(LocalDate date, String pattern) {
		
		 DateTimeFormatter formatter =
	                DateTimeFormatter.ofPattern(pattern);

	        return date.format(formatter);
	}
	
}
