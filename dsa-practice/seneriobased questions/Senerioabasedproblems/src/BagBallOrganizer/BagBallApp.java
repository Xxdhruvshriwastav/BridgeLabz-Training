package BagBallOrganizer;

import java.util.ArrayList;

public class BagBallApp {

    public static void main(String[] args) {

        // Create bags
        Bag bag1 = new Bag(101, "Red", 3);
        Bag bag2 = new Bag(102, "Blue", 2);

        // Create balls
        Ball b1 = new Ball(1, "Yellow", "Small");
        Ball b2 = new Ball(2, "Green", "Medium");
        Ball b3 = new Ball(3, "Red", "Large");
        Ball b4 = new Ball(4, "Blue", "Small");

        // Add balls
        bag1.addBall(b1);
        bag1.addBall(b2);
        bag1.addBall(b3);
        bag1.addBall(b4); 

        bag2.addBall(b4);
        bag2.addBall(b1);

        // Display balls
        bag1.displayBalls();
        bag2.displayBalls();

        // Remove ball
        bag1.removeBall(2);

        // Display again
        bag1.displayBalls();

     
       
        ArrayList<Bag> bags = new ArrayList<>();
        bags.add(bag1);
        bags.add(bag2);

        for (Bag bag : bags) {
            System.out.println(
                    "Bag ID: " + bag.getBagId() +
                    " → Balls count: " + bag.getBallCount()
            );
        }
    }
}
