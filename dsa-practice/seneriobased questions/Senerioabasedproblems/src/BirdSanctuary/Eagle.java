package BirdSanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(int id, String name) {
        super(id, name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying high.");
    }

    @Override
    public void showInfo() {
        System.out.println(getId() + " | " + getName() + " | Eagle | Fly");
    }
}
