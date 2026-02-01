package SmartCity.serviceimpl;

import SmartCity.service.*;

public class MetroService implements TransportService{

	    public String getName() {
	        return "Metro";
	    }

	    public double getFare() {
	        return 50;
	    }

	    public String getTime() {
	        return "08:10 AM";
	    }
}
