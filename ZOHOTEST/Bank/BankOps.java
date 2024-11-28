package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BankOps {
    Scanner sc = new Scanner(System.in);
    
    // holds transaction lists of every user
    private ArrayList <Transaction> transactions=new ArrayList<>();

    void withdrawal(String userName){
        System.out.println("Enter Amount to withdraw");
        double withdrawAmount = sc.nextDouble();
        if(!validateBalance(withdrawAmount, userName))
            return;
        Customer cObj = Bank.customerMap.get(userName);
        cObj.setBalance(cObj.getBalance() - withdrawAmount);
        addTransaction("Withdraw",withdrawAmount,cObj.getBalance(),userName);
        System.out.println("Withdarwal success ");
    }

    void cashDeposit(String userName){
        System.out.println("Enter value to deposit ");
        double amount = sc.nextDouble();
        Customer cObj = Bank.customerMap.get(userName);
        cObj.setBalance(amount+cObj.getBalance());
        addTransaction("Cash Deposit",amount,cObj.getBalance(),userName);
        System.out.println("Amount added successfully ");
    }

    void amountTransfer(String userName){
        System.out.println("Enter amount to transfer ");
        double amount = sc.nextDouble();
        System.out.println("Enter beneficiary account number ");
        long accountNum = sc.nextLong();

        Customer cObj = null;
        for(Customer el : Bank.customerList){
            if(el.getAccountId() == accountNum)
                cObj = el;
        }
        if(cObj == null){
            System.out.println("Account number entered is wrong ty agaim");
            return;
        }
        if(!validateBalance(amount, userName))
            return;
        cObj.setBalance(amount+cObj.getBalance());
        Customer loggedUser = Bank.customerMap.get(userName);
        loggedUser.setBalance(loggedUser.getBalance() - amount);
        addTransaction("Amount Transfer",amount,cObj.getBalance(),userName);

        System.out.println("transfer success ");
    }

    private boolean validateBalance(double amount,String userName){
        double availBal  = Bank.customerMap.get(userName).getBalance();
        if((availBal - amount) <= 1000 && (availBal - amount) >= 0){
            System.out.println("No Enough minimum Balance");
            return false;
        }
        else if((availBal - amount) <= 0){
            System.out.println("No Enough Balance");
            return false;
        }
         return true;
    }

    void addTransaction(String type,double amount, double balance, String userName){
        if(Bank.bankOpsObjects.containsKey(userName)){
            BankOps bankOpsObj = Bank.bankOpsObjects.get(userName);
            Transaction trans = new Transaction(++Bank.transactionId, type, amount, balance);
            bankOpsObj.transactions.add(trans);
        }else{
            BankOps bankOpsObj = new BankOps();
            Transaction trans = new Transaction(++Bank.transactionId, type, amount, balance);
            bankOpsObj.transactions.add(trans);
            Bank.bankOpsObjects.put(userName, bankOpsObj);
        }
    }

    void listTransaction(String userName){
        System.out.println("Showing Transaction History ");
        BankOps bankOpsObj = Bank.bankOpsObjects.get(userName);
        // per user
        ArrayList <Transaction> transactions = bankOpsObj.transactions;

        for(Transaction el: transactions){
            System.out.println(el.getTransactionId()+" "+el.getTransactionType()+" "+el.getAmount()+" "+el.getBalance());
        }
    }

    void listTopCustomers(){
        System.out.println("Enter number of top Customers you want to List");
        int n = sc.nextInt();
        // keepping track of customer printed
        HashMap<Double,Customer> customerMap = new HashMap<>();

        for(int i = 0;i< n && i< Bank.customerList.size();i++){
            Customer cObj = Bank.customerList.get(0);
            double maxBal = cObj.getBalance();
            for(Customer el: Bank.customerList){
                if(maxBal <= el.getBalance() && !customerMap.containsValue(el))
                    cObj = el;
            }
            customerMap.put(cObj.getBalance(), cObj);
            System.out.println(cObj.getCustomerId()+" "+cObj.getAccountId()+" "+cObj.getName()+" "+cObj.getBalance());
        }
        System.out.println();
        if(customerMap.size() < n)
            System.out.println("Number of Customers are lesser than "+ n +" hence printing "+customerMap.size()+" customers ");
    }
}
