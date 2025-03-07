package Ecommerce;

public class Customers {
    private String userName;
    private String passWord;
    private String mobile;
    private Double balance;

    public Customers(String userName, String passWord, String mobile, Double balance) {
        this.userName = userName;
        this.passWord = passWord;
        this.mobile = mobile;
        this.balance = balance;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public Double getBalance() {
        return balance;
    }
}
