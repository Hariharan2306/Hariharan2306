package ZSystemDesign.CabBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
    static Scanner sc = new Scanner(System.in);

    public static void booking() {
        System.out.println("Enter pickup spot: ");
        char pickup = sc.next().charAt(0);
        System.out.println("Enter drop spot: ");
        char drop = sc.next().charAt(0);
        System.out.println("Enter pickup time: ");
        int pickupTime = sc.nextInt();

        if (!isAnyAvail(pickupTime)) {
            System.out.println("No taxis Avail at taht time ");
            return;
        }
        Cabs cabToBook = findClosest(pickup);
    }

    private static boolean isAnyAvail(int pickupTime) {
        ArrayList<Cabs> cabs = Cabs.cabs;
        for (Cabs el : cabs) {
            if (el.getFreeTime() < pickupTime)
                return true;
        }
        return false;
    }

    private static Cabs findClosest(char pickup) {
        ArrayList<Cabs> cabs = Cabs.cabs;
        Cabs closestsCab = cabs.get(0);

        for (Cabs el : cabs) {
            if (Math.abs(el.getLocation() - pickup) < Math.abs(closestsCab.getLocation() - pickup))
                closestsCab = el;
            else if (Math.abs(el.getLocation() - pickup) == Math.abs(closestsCab.getLocation() - pickup))
                closestsCab = el.getEarning() < closestsCab.getEarning() ? el : closestsCab;
        }
        return closestsCab;
    }

    public static void displayTaxis() {

    }
}
