package BirdSanctuary;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(int id, String name) {
        super(id, name, "Sparrow");
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    public void showInfo() {
        System.out.println(getId() + " | " + getName() + " | Sparrow | Fly");
    }
}

