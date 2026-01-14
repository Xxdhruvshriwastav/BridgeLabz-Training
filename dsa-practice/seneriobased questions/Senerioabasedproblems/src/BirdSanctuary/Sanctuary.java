package BirdSanctuary;

import java.util.ArrayList;

public class Sanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    // ✅ Add Bird
    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    // ✅ Display All Birds
    public void displayAllBirds() {
        if (birds.isEmpty()) {
            System.out.println("No birds available in the sanctuary.");
            return;
        }

        for (Bird b : birds) {
            b.showInfo();
            b.eat();
        }
    }

    // ✅ Display Flying Birds
    public void displayFlyingBirds() {
        boolean found = false;

        for (Bird b : birds) {
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flying birds available.");
        }
    }

    // ✅ Display Swimming Birds (FIXED)
    public void displaySwimmingBirds() {
        boolean found = false;

        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No swimming birds available.");
        }
    }

    // ✅ Display Birds that can Fly & Swim
    public void displayBoth() {
        boolean found = false;

        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                b.showInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No birds can both fly and swim.");
        }
    }

    // ✅ Remove Bird by ID
    public void removeBird(int id) {
        boolean removed = birds.removeIf(b -> b.getId() == id);

        if (removed) {
            System.out.println("Bird removed successfully.");
        } else {
            System.out.println("Bird with ID " + id + " not found.");
        }
    }

    // ✅ Sanctuary Report
    public void report() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}
