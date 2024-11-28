package SystemDesign.BankDesign.src;
import java.util.Scanner;
public class ATM {
    static Scanner sc=new Scanner(System.in);
    public void deposit(){
        System.out.println("Enter Acc ID you'd like to deposit to");
        int id=sc.nextInt();
        System.out.println("enter amount you'd like to deposit ");
        double amount=sc.nextDouble();
        Customer customer=Bank.customerMap.get(id);//whole details of customer is now in customer obj

        if(amount>0){
            customer.balance+=amount;
            System.out.println("deposit success ");

            Bank.customerMap.put(id,customer);

            TransactionFileHandler handler=new TransactionFileHandler();
            int lastTransactionId=handler.getLastTransactionId(id);

            Transaction trans=new Transaction(lastTransactionId++,"deposit",amount, customer.balance);
            handler.writeTransaction(id,trans);
        }
        else
            System.out.println("the amount you'd like to add can't be added ");
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw ");
        double withdrawAmount=sc.nextInt();
        System.out.println("Reconfirm your id ");
        int withdrawID=sc.nextInt();
        Customer customer=Bank.customerMap.get(withdrawID);
        if(customer.balance<=1000){
            System.out.println("insufficient balance ");
            return;
        }
        customer.balance-=withdrawAmount;
        System.out.println("money withdraw success ");

        Bank.customerMap.put(withdrawID,customer);

        TransactionFileHandler handler=new TransactionFileHandler();
        int lastTransactionId=handler.getLastTransactionId(withdrawID);

        Transaction trans=new Transaction(lastTransactionId++,"withdraw",withdrawAmount, customer.balance);
        handler.writeTransaction(withdrawID,trans);
    }
    public void fundTransfer(){
        System.out.println("please reconfirm your id from which you'd like to transfer money from ");
        int fromId=sc.nextInt();
        System.out.println("Enter ID which you'd like to transfer money to ");
        int toId=sc.nextInt();
        System.out.println("Enter amount you'd like to transfer ");
        double transferAmount=sc.nextDouble();

        Customer fromCustomer=Bank.customerMap.get(fromId);
        Customer toCustomer=Bank.customerMap.get(toId);

        if(!(toCustomer==null)){
            if(fromCustomer.balance>= 1000+transferAmount){
                fromCustomer.balance-=transferAmount;
                toCustomer.balance+=transferAmount;
                System.out.println("transfer success");

                Bank.customerMap.put(fromId,fromCustomer);
                Bank.customerMap.put(toId,toCustomer);

            }
            else
                System.out.println("Insufficient balance ");
        }
        else
            System.out.println("The customer ID given to transfer amount does not exists ");
    }

    private void TransactionLog(int customerId,int transactionId,String type,double amount,double balance){

        Transaction trans=new Transaction(transactionId,type,amount,balance);
        TransactionFileHandler handler=new TransactionFileHandler();
        handler.writeTransaction(customerId,trans);
    }
}