package ZSystemDesign.BankNoFile;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerOps {
    static Scanner sc = new Scanner(System.in);
    static Customers loggedCustomer = null;

    public static void signUp() {
        String name = "";
        do {
            System.out.println("Enter name: ");
            name = sc.nextLine();
            if (Customers.customerMap.containsKey(name)) {
                System.out.println("Name already taken, try another: ");
                name = "";
            }
        } while (name.equals(""));
        String pass = "";
        do {
            System.out.println("Enter password: should be of atleast 5 chars and no spl characters: ");
            pass = sc.nextLine();
            if (!validatePass(pass)) {
                System.out.println("Enter a valid pass: ");
                pass = "";
                continue;
            }
            System.out.println("Enter conform pass: ");
            if (!sc.nextLine().equals(pass)) {
                pass = "";
                System.out.println("password and conform pass mismatch");
            }
        } while (pass.equals(""));

        System.out.println("Enter mobile ");
        String mobile = sc.next();
        System.out.println("Enter DOB in this format - 01/01/2001");
        String dob = sc.next();
        long balanceToUpdate = 0;
        do {
            System.out.println("Enter amount to do as first transaction, min 500 balance");
            balanceToUpdate = sc.nextLong();
            if (balanceToUpdate < 500) {
                System.out.println("Balance should be atleast 500");
                balanceToUpdate = 0;
            }
        } while (balanceToUpdate == 0);

        Customers customer = new Customers(name, pass, mobile, dob, balanceToUpdate);
        Customers.customerMap.put(name, customer);
        System.out.println("Customer creation success ");
        System.out.println("Created Customer id " + customer.getCustomerId());
        System.out.println("\n");
    }

    public static boolean login() {
        System.out.println("Enter userName: ");
        String name = sc.next();

        if (!Customers.customerMap.containsKey(name)) {
            System.out.println("No such customer found try again ");
            return false;
        }
        Customers customer = Customers.customerMap.get(name);
        System.out.println("Enter password: ");
        String pass = sc.next();
        if (!customer.getpassString().equals(pass)) {
            System.out.println("Incorrect password");
            return false;
        }
        loggedCustomer = customer;
        System.out.println("Login success");
        return true;
    }

    private static boolean validatePass(String s) {
        if (s.length() < 5)
            return false;
        for (char el : s.toCharArray()) {
            if ((el >= 'A' && el <= 'Z') || (el >= 'a' && el <= 'z') || (el >= '0' && el <= '9'))
                continue;
            return false;
        }
        return true;
    }

    public static void listAllCustomers() {
        HashMap<String, Customers> customerMap = Customers.customerMap;
        for (Customers customer : customerMap.values()) {
            System.out.println("name - " + customer.getName());
            System.out.println("CustomerId - " + customer.getCustomerId());
            System.out.println("Mobile - " + customer.getMob());
            System.out.println("Balance - " + customer.getBalance());
            System.out.println("\n\n");
        }
    }

    public static void withdrawal() {
        System.out.println("Enter amount to withdraw ");
        long toWithdraw = sc.nextLong();
        long availBalance = loggedCustomer.getBalance();

        if (availBalance < toWithdraw) {
            System.out.println("You dont have sufficient balance: ");
            return;
        }
        Transactions transaction = new Transactions("withdraw", toWithdraw, loggedCustomer.getName());
        String transactionId = transaction.getTransactionId();
        loggedCustomer.transactions.put(transactionId, transaction);

        loggedCustomer.setBalance(availBalance - toWithdraw);
        System.out.println("Transaction Done, id - " + transactionId);
    }

    public static void deposit() {
        System.out.println("Enter amount to deposit ");
        long toDeposit = sc.nextLong();

        Transactions transaction = new Transactions("deposit", toDeposit, loggedCustomer.getName());
        String transactionId = transaction.getTransactionId();
        loggedCustomer.transactions.put(transactionId, transaction);

        loggedCustomer.setBalance(loggedCustomer.getBalance() + toDeposit);
        System.out.println("Transaction Done, id - " + transactionId);
    }

    public static void transfer() {
        System.out.println("Enter name to transfer to: ");
        String toTransfer = sc.next();
        if (!Customers.customerMap.containsKey(toTransfer)) {
            System.out.println("No such account holder");
            return;
        }
        System.out.println("Enter amount to transfer: ");
        long toTransferAmount = sc.nextLong();
        if (loggedCustomer.getBalance() < toTransferAmount) {
            System.out.println("You dont have sufficient balance: ");
            return;
        }
        Transactions transaction = new Transactions("transfer", toTransferAmount, loggedCustomer.getName(), toTransfer);
        String transactionId = transaction.getTransactionId();
        loggedCustomer.transactions.put(transactionId, transaction);

        loggedCustomer.setBalance(loggedCustomer.getBalance() - toTransferAmount);

        Transactions toTransaction = new Transactions("deposit", toTransferAmount, loggedCustomer.getName());
        String toTransactionId = transaction.getTransactionId();
        Customers toDepositCustomer = Customers.customerMap.get(toTransfer);

        toDepositCustomer.transactions.put(toTransactionId, toTransaction);

        toDepositCustomer.setBalance(toDepositCustomer.getBalance() + toTransferAmount);
        System.out.println("Transaction Done, id - " + transactionId);
    }

    public static void logout() {
        loggedCustomer = null;
    }

    public static void checkBalance() {
        System.out.println("balance " + loggedCustomer.getBalance());
    }
}
