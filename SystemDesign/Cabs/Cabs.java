package SystemDesign.Cabs;

public class Cabs {
    private int cabId;
    private String currentLocation;
    private String freeTime;
    private double earning;
    
    Cabs(int cabId,String currentLocation,String freeTime,double earning){
        this.cabId=cabId;
        this.currentLocation=currentLocation;
        this.freeTime=freeTime;
        this.earning=earning;
    }

    public void setEarning(double earning){
        this.earning = earning;
    }

    public void setFreeTime(String freeTime){
        this.freeTime = freeTime;
    }

    public void setCurrentLocation(String currentLocation){
        this.currentLocation = currentLocation;
    }

    public int getCabId(){return this.cabId;}
    public String getCurrentLocation(){return this.currentLocation;}
    public String getFreeTime(){return this.freeTime;}
    public double getEarning(){return this.earning;}
}
