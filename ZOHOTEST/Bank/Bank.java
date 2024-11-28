package Bank;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {

    String name;

    public static ArrayList <Customer> customerList=new ArrayList<Customer>();
    public static HashMap<String,Customer> customerMap=new HashMap<>();

    // holds BanksOps objs with which to get trans list per user
    public static HashMap<String,BankOps> bankOpsObjects=new HashMap<>();

    // last id to increment
    public static int customerId;
    public static long accNo;
    public static long transactionId = 10000;
    public static final double INITIALBALANCE=10000;
}
