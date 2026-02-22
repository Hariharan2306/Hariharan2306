package ZSystemDesign.BankNoFile;

import java.util.ArrayList;
import java.util.HashMap;

public class Customers {
    public long customerIdCounter = 10000;
    private String name;
    private String pass;
    private String mob;
    private String dob;
    private String cId;
    private long balance;

    public HashMap<String, Transactions> transactions = new HashMap<>();
    public static HashMap<String, Customers> customerMap = new HashMap<>();

    public Customers(
            String name, String pass,
            String mob, String dob,
            long balance) {
        this.name = name;
        this.pass = pass;
        this.mob = mob;
        this.dob = dob;
        this.cId = "c" + ++customerIdCounter;
        this.balance = balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerId() {
        return cId;
    }

    public String getpassString() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getMob() {
        return mob;
    }

    public long getBalance() {
        return balance;
    }

}
