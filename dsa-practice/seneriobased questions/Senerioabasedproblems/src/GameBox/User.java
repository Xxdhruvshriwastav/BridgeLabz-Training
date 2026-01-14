package GameBox;

import java.util.*;

public class User {

private String userName;
	
private List<Game> ownedGames = new ArrayList<>();

	public User(String userName) {
		this.userName = userName;
	}
	
	//
	public void downloadGame(Game game) {
		game.download();
		
	}
	// playdemo
	
	public void playDemo(Game game) {
		game.playDemo();
	}
	
	// buyGame
	 public void buyGame( Game game) {
		 ownedGames.add(game);
		 System.out.println(userName + " purchase the game " + game.getTitle());
	 }
	
	// showownedgame
	
	 public void showOwnedGames() {
		 System.out.println(userName + "'s GAmes");
		 for(Game g : ownedGames) {
			 System.out.println("--" + "Title" + g.getTitle() + "Price" + g.getPrice());
		 }
	 }
	 
	 
}
