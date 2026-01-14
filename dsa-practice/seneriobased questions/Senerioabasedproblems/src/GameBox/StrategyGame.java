package GameBox;

public class StrategyGame extends Game{

	public StrategyGame  (String title, String genre, double price, int rating) {
		super(title, "Strategey", price, rating);
	}

	public StrategyGame(String title, String genre, int rating) {
		super(title, "Strategy", rating);
	}
	
	@Override
	public void download() {
		System.out.println(title + "Strategy game downloaded");
		
	}

	@Override
	public void playDemo() {
		System.out.println("Playing demo of Strategy " + title);
		
	}
}
