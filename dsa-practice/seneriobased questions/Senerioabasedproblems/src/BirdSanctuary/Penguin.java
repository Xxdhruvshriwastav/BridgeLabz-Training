package BirdSanctuary;

public class Penguin extends Bird implements Swimmable {

    public Penguin(int id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName() + " swims fast.");
    }

    public void showInfo() {
        System.out.println(getId() + " | " + getName() + " | Penguin | Swim");
    }
}
