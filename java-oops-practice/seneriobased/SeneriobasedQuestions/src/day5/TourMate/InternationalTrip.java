package day5.TourMate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration) {
        super(destination, duration);
        calculateTotal();
    }

    @Override
    protected int transportCharge() {
        return 10000;
    }

    @Override
    protected int hotelCharge() {
        return 20000;
    }

    @Override
    protected int activityCharge() {
        return 6000;
    }

    @Override
    public void book() {
        System.out.println("International Trip booked to " + getDestination());
        System.out.println("Passport & Visa verified");
        System.out.println("Total Cost: ₹" + totalBudget);
    }

    @Override
    public void cancel() {
        System.out.println("International Trip cancelled");
    }
}
