package BirdSanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(int id, String name) {
        super(id, name, "Seagull");
    }

    public void fly() {
        System.out.println(getName() + " flies near the sea.");
    }

    public void swim() {
        System.out.println(getName() + " swims on water.");
    }

    public void showInfo() {
        System.out.println(getId() + " | " + getName() + " | Seagull | Fly & Swim");
    }
}
