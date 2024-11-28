package SystemDesign.Simplelogin;

public class User {
    int id;
    String userName;
    String mobile;
    String dob;
    String password;
    
    public User(String userName,String mobile,String dob,String password,int id){
        this.userName = userName;
        this.mobile = mobile;
        this.dob = dob;
        this.password = password;
        this.id = id;
    }
    public String getUserName(){return userName;}
    public String getmobile(){return mobile;}
    public String getdob(){return dob;}
    public String getpassword(){return password;}
    public int getId(){return id;}
}
