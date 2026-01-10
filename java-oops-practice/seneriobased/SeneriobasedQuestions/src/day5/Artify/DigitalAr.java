package day5.Artify;

public class DigitalAr extends Artwork
{
	
	DigitalAr(String title,String artist, String licenseType,int price){
		super(title, artist, licenseType, price);
	}

	@Override
	public void license() {
		System.out.println("The Licence is Advance");
		
	}

}
