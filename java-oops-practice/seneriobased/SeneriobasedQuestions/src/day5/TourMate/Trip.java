package day5.TourMate;

public abstract class Trip implements IBookable {

    private String destination;
    private int duration;
    protected int totalBudget;

    public Trip(String destination, int duration) {
        this.destination = destination;
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalBudget() {
        return totalBudget;
    }

    protected abstract int transportCharge();
    protected abstract int hotelCharge();
    protected abstract int activityCharge();

    protected void calculateTotal() {
        totalBudget = transportCharge() + hotelCharge() + activityCharge();
    }
}
