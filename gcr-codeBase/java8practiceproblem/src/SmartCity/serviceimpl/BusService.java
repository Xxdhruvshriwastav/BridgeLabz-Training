package SmartCity.serviceimpl;

import SmartCity.service.*;


public class BusService implements TransportService {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Bus";
	}

	@Override
	public double getFare() {
		// TODO Auto-generated method stub
		return 80.00;
	}

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return "08:30";
	}

	

}
