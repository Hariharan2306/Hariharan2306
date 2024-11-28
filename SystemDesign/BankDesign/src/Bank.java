package SystemDesign.BankDesign.src;
import java.util.ArrayList;
import java.util.HashMap;
public class Bank {
    public static ArrayList <Customer> customerList=new ArrayList<Customer>();
    public static HashMap<Integer,Customer> customerMap=new HashMap<>();
    public static int customerId;
    public static long accNo;
    public static final double INITIALBALANCE=10000;

}
