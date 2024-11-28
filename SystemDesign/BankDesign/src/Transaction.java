package SystemDesign.BankDesign.src;
public class Transaction {
    public int transactionId;
    public String type;
    public double amount;
    public double balance;

    public Transaction(int transactionId, String type, double amount, double balance) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
    }

    public String toString(){
        return (transactionId + " " + type+ " " + amount + " " + balance);
    }
}
