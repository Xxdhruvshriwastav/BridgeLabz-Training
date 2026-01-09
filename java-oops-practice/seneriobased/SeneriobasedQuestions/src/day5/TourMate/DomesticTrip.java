package day5.TourMate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration) {
        super(destination, duration);
        calculateTotal();
    }

    @Override
    protected int transportCharge() {
        return 800;
    }

    @Override
    protected int hotelCharge() {
        return 5000;
    }

    @Override
    protected int activityCharge() {
        return 600;
    }

    @Override
    public void book() {
        System.out.println("Domestic Trip booked to " + getDestination());
        System.out.println("Total Cost: ₹" + totalBudget);
    }

    @Override
    public void cancel() {
        System.out.println("Domestic Trip cancelled");
    }
}
