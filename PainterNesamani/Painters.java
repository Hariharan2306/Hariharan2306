package PainterNesamani;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Painters {
    static String customerCode = "10001";
    private String mobile;
    private String name;
    private Date freeStartTime;
    private Date freeEndTime;
    private double cost;
    private String passString;

    public Painters(String mobile, String name, double cost, Date freeStartTime,
            Date freeEndTime, String passString) {
        this.mobile = mobile;
        this.name = name;
        this.cost = cost;
        this.freeStartTime = freeStartTime;
        this.freeEndTime = freeEndTime;
        this.passString = passString;
    }

    public Painters() {
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public Date getfreeStartTime() {
        return freeStartTime;
    }

    public Date getfreeEndTime() {
        return freeEndTime;
    }

    public String getPassString() {
        return passString;
    }

    public Date formatDate(String dateString) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        Date date = null;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            System.out.println("\n \n Pls enter date in expected format ");
            e.printStackTrace();
        }
        return date;
    }
}
