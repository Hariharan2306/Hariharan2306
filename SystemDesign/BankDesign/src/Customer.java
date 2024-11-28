package SystemDesign.BankDesign.src;
public class Customer {
    public int customerId;
    public long accNo;
    public String name;
    public double balance;
    public String password;

    public Customer(int customerId,long accNo,String name,double balance,String password){
        this.customerId=customerId;
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
        this.password=password;
    }
    public String toString(){
        return (customerId + " " + accNo+ " " + name + " " + balance + " " + password);
    }
}
