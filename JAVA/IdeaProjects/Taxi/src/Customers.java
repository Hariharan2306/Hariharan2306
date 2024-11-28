package JAVA.IdeaProjects.Taxi.src;

import java.util.ArrayList;
import java.util.HashMap;
public class Customers {
    private int bookingId;
    private int customerId;
    private int taxiNo;
    private char pickupPoint;
    private char dropPoint;
    private int pickupTime;

    public static ArrayList <Customers> customers = new ArrayList<>();

    public Customers(int bookingId, int customerId, int taxiNo, char pickupPoint, char dropPoint,
                     int pickupTime) {

        this.bookingId = bookingId;
        this.customerId = customerId;
        this.taxiNo = taxiNo;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
    }
}
