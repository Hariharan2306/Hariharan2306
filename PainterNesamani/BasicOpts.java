package PainterNesamani;

import java.util.Scanner;

public class BasicOpts {
    static Scanner sc = new Scanner(System.in);

    public void login() {
        int op = 1;
        do {
            System.out.println("Enter Customer code ");
            String cCode = sc.next();
            System.out.println("Enter username ");
            String userName = sc.next();
            System.out.println("Enter password ");
            String passString = sc.next();

            boolean validated = false;
            boolean isCustomer = cCode.equals(Customers.customerCode);
            boolean isPainter = cCode.equals(Painters.customerCode);
            Customers c = null;
            Painters p = null;

            if (isCustomer) {
                c = DB.customers.get(userName);
                validated = validateUser(c, passString, cCode);
            } else if (isPainter) {
                p = DB.painter.get(userName);
                validated = validateUser(p, passString, cCode);
            } else
                System.out.println("No such Customer code exists, ");

            if (validated) {
                reDirection(isPainter, isCustomer, userName);
                break;
            }

            System.out.println("\n To try again Enter 1, \n To go back enter 0");
            op = sc.nextInt();

        } while (op != 0);
    }

    private boolean validateUser(Object user, String passString, String cCode) {
        String loginType = cCode.equals(Customers.customerCode) ? "Customer" : "Painter";
        if (user == null) {
            System.out.println("No " + loginType + " exists with this username.");
            return false;
        }
        String dbPass = user instanceof Customers ? ((Customers) user).getPassString()
                : ((Painters) user).getPassString();

        if (!dbPass.equals(passString)) {
            System.out.println("Password mismatch, please recheck.");
            return false;
        }
        return true;
    }

    private void reDirection(boolean isPainter, boolean isCustomer, String userName) {
        if (isPainter) {
            System.out.println("\nWelcome to Painter Area  " + userName);
            System.out.println("No Action as of now for Painter");
        } else if (isCustomer) {
            System.out.println("\n" + "Welcome to Customer Area  " + userName);
            CustomerOps cOps = new CustomerOps();
            cOps.customerMenu();
        }
    }
}
