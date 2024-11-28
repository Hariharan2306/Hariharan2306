package stock_manager;

public class StockManagerDetails {
    public int sId;
    public String sName;
    public String sPassword;
    public String sMobNo;
    public String email;

    public StockManagerDetails(int sId, String sName, String sPassword, String sMobNo, String email) {
        this.sId = sId;
        this.sName = sName;
        this.sPassword = sPassword;
        this.sMobNo = sMobNo;
        this.email = email;
    }
    public String toString(){
        return (sId+" "+sName+" "+sPassword+" "+sMobNo+" "+email);
    }
}
