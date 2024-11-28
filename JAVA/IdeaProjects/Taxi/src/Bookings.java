package JAVA.IdeaProjects.Taxi.src;

import java.util.ArrayList;
public class Bookings {
    private int bookingId,customerId,pickupTime,dropTime,cabId;
    private char pickupPoint, dropPoint;
    private long amount;
    private String cabRegNo;

    public static ArrayList <Bookings>bookingsList = new ArrayList();

    public Bookings(int bookingId, int customerId, int pickupTime, int dropTime,
                    int cabId, String cabRegNo, char pickupPoint, char dropPoint, long amount) {

        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.cabId = cabId;
        this.cabRegNo=cabRegNo;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.amount = amount;
    }

    public int getBookingId(){
        return bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }
    public int getPickupTime() {
        return pickupTime;
    }
    public int getDropTime() {
        return dropTime;
    }
    public int getCabId() {
        return cabId;
    }
    public char getPickupPoint() {
        return pickupPoint;
    }
    public char getDropPoint() {
        return dropPoint;
    }
    public long getAmount() {
        return amount;
    }
    public String getCabRegNo() {
        return cabRegNo;
    }
}
