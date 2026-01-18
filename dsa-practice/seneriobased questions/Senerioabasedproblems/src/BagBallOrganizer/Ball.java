package BagBallOrganizer;

public class Ball {

    private int id;
    private String color;
    private String size; // small / medium / large

    public Ball(int id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void displayBall() {
        System.out.println(
                "Ball ID: " + id +
                ", Color: " + color +
                ", Size: " + size
        );
    }
}

