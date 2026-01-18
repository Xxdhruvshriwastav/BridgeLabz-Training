package BagBallOrganizer;

import java.util.ArrayList;

public class Bag {

    private int bagId;
    private String color;
    private int capacity;

    private ArrayList<Ball> balls = new ArrayList<>();

    // Constructor
    public Bag(int bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
    }

    // Add ball
    public void addBall(Ball ball) {

        if (balls.size() >= capacity) {
            System.out.println(" Bag " + bagId + " is FULL!");
            return;
        }

        balls.add(ball);
        System.out.println(" Ball added to Bag " + bagId);
    }

    // Remove ball by ID
    public void removeBall(int ballId) {

        for (Ball b : balls) {
            if (b.getId() == ballId) {
                balls.remove(b);
                System.out.println(" Ball removed from Bag " + bagId);
                return;
            }
        }

        System.out.println(" Ball not found in Bag " + bagId);
    }

    // Display balls in bag
    public void displayBalls() {

        System.out.println("\nBag ID: " + bagId +
                " | Color: " + color +
                " | Capacity: " + capacity);

        if (balls.isEmpty()) {
            System.out.println("No balls inside this bag.");
            return;
        }

        for (Ball b : balls) {
            b.displayBall();
        }
    }

    // Ball count
    public int getBallCount() {
        return balls.size();
    }

    public int getBagId() {
        return bagId;
    }
}

