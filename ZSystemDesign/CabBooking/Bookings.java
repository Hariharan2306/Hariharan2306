package ZSystemDesign.CabBooking;

public class Bookings {
    private long initialBookingId = 10000;

    private char pickupLocation;
    private char dropLocation;
    private long amount;
    private int pickupTime;
    private int dropTime;
    private int taxiId;
    private String bookingId;

    public Bookings(char pickupLocation, char dropLocation, long amount, int pickupTime, int dropTime, int taxiId) {
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.amount = amount;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.taxiId = taxiId;
        this.bookingId = "b" + ++initialBookingId;
    }
}
