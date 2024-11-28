package JAVA.IdeaProjects.Taxi.src;

import java.util.ArrayList;

public class Cabs {
    private final int cabId;
    private final String cabRegNo;
    private long earned;
    private char currentLocation;
    private int freeTime;

    public static ArrayList<Cabs> cabs=new ArrayList<>();

    public Cabs(int cabId, String cabRegNo, long earned,char currentLocation,int freeTime) {
        this.cabId = cabId;
        this.cabRegNo = cabRegNo;
        this.earned = earned;
        this.currentLocation = currentLocation;
        this.freeTime = freeTime;
    }

    public void setEarned(long earned) {
        this.earned = earned;
    }
    public void setCurrentLocation(char currentLocation) {
        this.currentLocation = currentLocation;
    }
    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }

    public long getEarned() {
        return earned;
    }
    public char getCurrentLocation() {
        return currentLocation;
    }
    public int getFreeTime(){
        return freeTime;
    }
    public int getCabId() {
        return cabId;
    }
    public String getCabRegNo(){
        return cabRegNo;
    }
}