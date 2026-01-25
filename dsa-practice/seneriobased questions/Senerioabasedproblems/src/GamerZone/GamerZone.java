package GamerZone;
import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class GamerZone {

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        players.add(new Player("Ashish", 320));
        players.add(new Player("Ravi", 150));
        players.add(new Player("Amit", 410));
        players.add(new Player("Ritesh", 280));
        players.add(new Player("Swaraj", 360));

        // QUICK SORT
        quickSort(players, 0, players.size() - 1);

        

        int rank = 1;
        for (Player p : players) {
            System.out.println(rank++ + ". " + p.name + " → " + p.score);
        }
    }

    // QUICK SORT METHOD
    public static void quickSort(List<Player> list, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    // PARTITION (Descending Order)
    public static int partition(List<Player> list, int low, int high) {

        Player pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // DESCENDING SORT
            if (list.get(j).score > pivot.score) {
                i++;

                Player temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        Player temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }
}
