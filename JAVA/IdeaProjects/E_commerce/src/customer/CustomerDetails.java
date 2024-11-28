package customer;

public class CustomerDetails {
    public String name;
    public String password;
    public String mobileNo;
    public String address;
    public String email;

    public CustomerDetails(String name, String password, String mobileNo, String address, String email) {
        this.name = name;
        this.password = password;
        this.mobileNo = mobileNo;
        this.address = address;
        this.email = email;
    }
    public String toString(){
        return (name+" "+password+" "+mobileNo+" "+address+" "+email);
    }
}
