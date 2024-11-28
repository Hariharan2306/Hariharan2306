package PainterNesamani;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initialize();
        menu();
    }

    static void initialize() {
        Painters p = new Painters();
        Painters p1 = new Painters("xxxx", "Hariharan", 10000,
                p.formatDate("25-08-2024 09:45"), p.formatDate("25-08-2024 11:15"), "xyz");

        Painters p2 = new Painters("xxxx", "Keerthi", 10000,
                p.formatDate("25-08-2024 13:30"), p.formatDate("25-08-2024 15:00"), "xyz");

        Painters p3 = new Painters("xxxx", "Karthi", 10000,
                p.formatDate("25-08-2024 18:20"), p.formatDate("25-08-2024 19:50"), "xyz");

        DB.painter.put("Hariharan", p1);
        DB.painter.put("Keerthi", p2);
        DB.painter.put("Karthi", p3);

        Customers c1 = new Customers("ABCD", "fuyiycfewi", "123");
        Customers c2 = new Customers("XYZA", "fuyiycfewi", "987");

        DB.customers.put("ABCD", c1);
        DB.customers.put("XYZA", c2);
    }

    static void menu() {
        int opt;
        BasicOpts o = new BasicOpts();
        do {
            System.out.println("Enter 1 to login ");
            System.out.println("Enter 0 to Exit");
            opt = sc.nextInt();
            switch (opt) {
                case 0:
                    break;
                case 1:
                    o.login();
                    break;

                default:
                    System.out.println("Enter Valid Options from above");
                    break;
            }
        } while (opt != 0);
    }
}
