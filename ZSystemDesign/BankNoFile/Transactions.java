package ZSystemDesign.BankNoFile;

public class Transactions {
    public static long transactionIdCounter = 10000;
    private String transactionId;
    private String type;
    private long amount;
    private String doneBy;
    private String doneTo;

    public Transactions(String type, long amount, String doneBy, String doneTo) {
        this.transactionId = "t" + ++transactionIdCounter;
        this.type = type;
        this.amount = amount;
        this.doneBy = doneBy;
        this.doneTo = doneTo;
    }

    public Transactions(String type, long amount, String doneBy) {
        this.transactionId = "t" + ++transactionIdCounter;
        this.type = type;
        this.amount = amount;
        this.doneBy = doneBy;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
