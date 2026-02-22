package ZSystemDesign.BankNoFile;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        sc.close();
    }

    public static void menu() {
        int op = -1;
        do {
            System.out.println("Enter 1 for login as customer: ");
            System.out.println("Enter 2 to create new bank account: ");
            System.out.println("Enter -1 to exit ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    if (CustomerOps.login())
                        loggedMenu();
                    break;
                case 2:
                    CustomerOps.signUp();
                    break;

                default:
                    break;
            }
        } while (op != -1);
    }

    public static void loggedMenu() {
        int op = 0;
        do {
            System.out.println();
            System.out.println("enter 1 to list all customers ");
            System.out.println();
            System.out.println("enter 2 for withdrawal ");
            System.out.println();
            System.out.println("Enter 3 for cash deposit ");
            System.out.println();
            System.out.println("Enter 4 for Amount Transfer ");
            System.out.println();
            System.out.println("Enter 5 to view Transfer ");
            System.out.println();
            System.out.println("Enter 7 to view top n customers ");
            System.out.println();
            System.out.println("Enter 8 check balance ");
            System.out.println();
            System.out.println("Enter 9 to logout ");
            System.out.println();
            System.out.println("Enter 0 exit ");
            System.out.println();
            op = sc.nextInt();

            switch (op) {
                case 1:
                    CustomerOps.listAllCustomers();
                    break;
                case 2:
                    CustomerOps.withdrawal();
                    break;
                case 3:
                    CustomerOps.deposit();
                    break;
                case 4:
                    CustomerOps.transfer();
                    break;
                case 8:
                    CustomerOps.checkBalance();
                    break;
                case 9:
                    CustomerOps.logout();
                    op = 0;
                    break;

                default:
                    break;
            }
        } while (op != 0);
    }
}
