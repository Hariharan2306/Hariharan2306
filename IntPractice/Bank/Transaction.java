package IntPractice.Bank;

public class Transaction {
    private long transactionId;
    private String transactionType;
    private double amount;
    private double balance;

    Transaction(long transactionId,String transactionType,double amount,double balance){
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
    }
    public long getTransactionId(){ return transactionId;}
    public String getTransactionType(){ return transactionType;}
    public double getAmount(){ return amount;}
    public double getBalance(){ return balance;}
}