package ZSystemDesign.CabBooking;

import java.util.ArrayList;
import java.util.HashMap;

public class Cabs {
    private int freeTime;
    private char location;
    private int taxiId;
    private long earned;

    public HashMap<String, Bookings> bookingsMap = new HashMap<>();
    public static ArrayList<Cabs> cabs = new ArrayList<>();

    public Cabs(int freeTime, char location, int taxiId, long earned) {
        this.freeTime = freeTime;
        this.location = location;
        this.taxiId = taxiId;
        this.earned = earned;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public char getLocation() {
        return location;
    }

    public long getEarning() {
        return earned;
    }
}
