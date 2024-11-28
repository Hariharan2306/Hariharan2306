package Bank;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        CustomerFileHandler cHandle = new CustomerFileHandler();
        cHandle.initialize();
        menu();
    }
    static void menu(){
        int op = 0;
        CustomerOps cOps = new CustomerOps(); 
        BankOps bOps = new BankOps(); 
        String userName,userPass;
        do{
            System.out.println();
            System.out.println("enter 1 to add new customers ");
            System.out.println();
            System.out.println("enter 2 to list all customers ");
            System.out.println();
            System.out.println("enter 3 for withdrawal ");
            System.out.println();
            System.out.println("Enter 4 for cash deposit ");
            System.out.println();
            System.out.println("Enter 5 for Amount Transfer ");
            System.out.println();
            System.out.println("Enter 6 to view Transfer ");
            System.out.println();
            System.out.println("Enter 7 to view top n customers ");
            System.out.println();
            System.out.println("Enter 0 exit ");
            System.out.println();
            op = sc.nextInt();

            switch (op) {
                case 1:
                    cOps.addCustomers();
                    break;
                case 2:
                    cOps.listCustomers();
                    break;
                case 3: 
                    System.out.println("Enter name ");
                    userName = sc.next();
                    System.out.println("Enter password ");
                    userPass = sc.next();

                    if(!cOps.authentication(userName,userPass))
                        System.out.println("\n Auth failed");
                    else 
                        bOps.withdrawal(userName);
                    break;
                case 4: 
                    System.out.println("Enter name ");
                    userName = sc.next();
                    System.out.println("Enter password ");
                    userPass = sc.next();

                    if(!cOps.authentication(userName,userPass))
                        System.out.println("\n Auth failed");
                    else 
                        bOps.cashDeposit(userName);
                    break;
                case 5: 
                    System.out.println("Enter name ");
                    userName = sc.next();
                    System.out.println("Enter password ");
                    userPass = sc.next();

                    if(!cOps.authentication(userName,userPass))
                        System.out.println("\n Auth failed");
                    else 
                        bOps.amountTransfer(userName);
                    break;
                case 6: 
                    System.out.println("Enter name ");
                    userName = sc.next();
                    System.out.println("Enter password ");
                    userPass = sc.next();

                    if(!cOps.authentication(userName,userPass))
                        System.out.println("\n Auth failed");
                    else 
                        bOps.listTransaction(userName);
                    break;
                case 7: 
                    bOps.listTopCustomers();
                default:
                    break;
            }
        }while(op != 0);
        sc.close();
    }
}
