package IntPractice.Bank;

public class Customer {
    private int customerId;
    private long accountId;
    private String name;
    private double balance;
    private String password;

    Customer(int customerId,long accountId,String name,double balance,String password){
        this.customerId = customerId;
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }
    public long getAccountId() {
        return accountId;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
}
