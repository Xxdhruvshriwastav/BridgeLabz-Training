package GameBox;

public class ArcadeGame extends Game {

	
	public ArcadeGame(String title, String genre, double price, int rating) {
		super(title, "Arcade", price, rating);
	}
	
	public ArcadeGame(String title, String genre, int rating) {
		super(title, "Arcade", rating);
	}

	@Override
	public void download() {
		System.out.println(title + "arcade game downloaded");
		
	}

	@Override
	public void playDemo() {
		System.out.println("Playing demo of " + title);
		
	}
}
