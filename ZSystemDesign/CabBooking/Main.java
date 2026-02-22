package ZSystemDesign.CabBooking;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initialize();
        menu();
    }

    private static void menu() {
        int op = -1;
        do {
            System.out.println("Enter 1 to  book");
            System.out.println("Enter 2 to  display taxi details");
            System.out.println("Enter -1 to exit ");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    Operations.booking();
                    break;
                case 2:
                    Operations.displayTaxis();
                    break;
                default:
                    break;
            }
        } while (op != -1);
    }

    private static void initialize() {
        System.out.println("Enter number of taxis - ");
        int taxiCount = sc.nextInt();
        for (int i = 0; i < taxiCount; i++) {
            Cabs cab = new Cabs(9, 'A', i + 1, 0);
            Cabs.cabs.add(cab);
        }
    }
}
