package day5.Artify;

public abstract class Artwork implements IPurchasable {

	private String title;
	private String artist;
	private String licenseType;
	private int price;
	
	Artwork (String title,String artist, String licenseType,int price){
		this.title = title;
		this.artist = artist;
		this.licenseType = licenseType;
		this.price = price;
	}
	
	public String getTitle() { return title; }
	
	public String getArtist() { return artist; }
	
	public String getlicenseType() { return licenseType; }
	
	public int getprice() { return price; }

	@Override
	 public void purchase(User user) {

        if (user.deductBalance(price)) {
            System.out.println(user.getName() + " purchased artwork: " + title);
        } else {
            System.out.println("Insufficient wallet balance to purchase " + title);
        }
    }

}
