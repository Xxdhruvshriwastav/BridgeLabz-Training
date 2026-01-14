package GameBox;

public abstract class Game implements  IDownloadable {

	String title;
	String genre;
	double price;
	int rating;
	
	// paid constructor
	
	public Game(String title, String genre, double price, int rating ) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}
	
	
	// constructor for free game 
	
	public Game (String title, String genre, int rating ) {
		this(title, genre, 0.0, rating);
	}
	
	public void applySesionalOffer() {
		price = price * 0.90; // 10 percent discount
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
}
