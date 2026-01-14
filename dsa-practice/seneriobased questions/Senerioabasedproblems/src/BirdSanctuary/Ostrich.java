package BirdSanctuary;

public class Ostrich extends Bird {

    public Ostrich(int id, String name) {
        super(id, name, "Ostrich");
    }

    public void showInfo() {
        System.out.println(getId() + " | " + getName() + " | Ostrich | Neither");
    }
}
