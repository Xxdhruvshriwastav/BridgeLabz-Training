import java.util.Scanner;

public class DeckOfCards {

    // Suits and Ranks
    static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace" };

    // Method to initialize the deck
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap deck[i] with deck[randomCardNumber]
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute n cards to x players
    public static String[][] distributeDeck(String[] deck, int n, int x) {
        if (n > deck.length) {
            System.out.println("Cannot distribute more cards than available in deck.");
            return null;
        }
        if (n % x != 0) {
            System.out.println("Cannot distribute cards evenly among players.");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[i * cardsPerPlayer + j];
            }
        }

        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {
        if (players == null)
            return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        shuffleDeck(deck);

        // Take input for number of cards and players
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        // Distribute cards
        String[][] players = distributeDeck(deck, n, x);

        // Print players and their cards
        printPlayers(players);

        sc.close();
    }
}
