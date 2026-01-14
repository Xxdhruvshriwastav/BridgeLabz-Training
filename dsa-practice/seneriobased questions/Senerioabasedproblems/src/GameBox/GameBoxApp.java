package GameBox;

public class GameBoxApp {

    public static void main(String[] args) {

        User user = new User("Ashish");

        // PAID Arcade Game
        Game arcade = new ArcadeGame(
                "Speed Racer",
                "Arcade",
                500,
                4        // rating int hona chahiye
        );

        // FREE Strategy Game
        Game strategy = new StrategyGame(
                "War Planner",
                "Strategy",
                5        // rating int
        );

        // spelling same as Game class
        arcade.applySesionalOffer();

        user.playDemo(arcade);
        user.buyGame(arcade);
        user.downloadGame(arcade);

        user.playDemo(strategy);
        user.buyGame(strategy);

        user.showOwnedGames();
    }
}
