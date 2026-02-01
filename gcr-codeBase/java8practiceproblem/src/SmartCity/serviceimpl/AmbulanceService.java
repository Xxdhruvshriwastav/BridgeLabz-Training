package SmartCity.serviceimpl;
import SmartCity.service.TransportService;
import SmartCity.service.EmergencyService;

public class AmbulanceService 
implements TransportService, EmergencyService {

	@Override
	    public String getName() {
		// TODO Auto-generated method stub
		return "Ambulance";
	    }

	    @Override
	    public double getFare() {
		// TODO Auto-generated method stub
		return 0;
	    }

	    @Override
	    public String getTime() {
		// TODO Auto-generated method stub
		return "Immidiate";
	    }

	
}
