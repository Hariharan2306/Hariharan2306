import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        final String customerFilePath = "/home/bcs225/Downloads/ZohoAssesmentHariharan (1)/ZohoAssesmentHariharan/Customers.txt";
        final String inventoryFilePath = "/home/bcs225/Downloads/ZohoAssesmentHariharan (1)/ZohoAssesmentHariharan/Inventory.txt";
        try {
            handler.initializer(customerFilePath, true);
            handler.initializer(inventoryFilePath, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        menu();
    }

    static void menu() {
        int option;
        Scanner sc = new Scanner(System.in);
        CustomerOperation op = new CustomerOperation();
        do {
            System.out.println("\nEnter 1 to login ");
            System.out.println("Enter -1 to exit ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    if (op.login())
                        op.customerModule();
                    break;
                case 2:
                    op.signUp();
                    break;
                case -1:
                    System.out.println("Exitinggg...");
                    break;
                default:
                    System.out.println("Enter valid Input");
                    break;
            }
        } while (option != -1);
    }
}
