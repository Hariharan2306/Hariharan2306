package PainterNesamani;

public class Customers {
    private String name;
    private String mobileNum;
    private String passString;
    static String customerCode = "10000";

    public Customers(String name, String mobileNum, String passString) {
        this.name = name;
        this.mobileNum = mobileNum;
        this.passString = passString;
    }

    public String getName() {
        return name;
    }

    public String getMobNum() {
        return mobileNum;
    }

    public String getPassString() {
        return passString;
    }
}
