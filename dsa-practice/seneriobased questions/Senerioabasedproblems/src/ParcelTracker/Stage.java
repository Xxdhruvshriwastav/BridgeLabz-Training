package ParcelTracker;

public class Stage {

    String stageName;   // Packed, Shipped, etc.
    Stage next;         // next stage reference

    public Stage(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}
