package SmartCity.serviceimpl;


import SmartCity.service.*;
public class TaxiService implements TransportService
{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Taxi";
	}

	@Override
	public double getFare() {
		// TODO Auto-generated method stub
		return 200.00;
	}

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return "08:00";
	}

	
}
