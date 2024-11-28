package SystemDesign.Cabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CabsOperations {
    static Scanner sc = new Scanner(System.in);
    public static void bookCab() {
        System.out.println("Book a cab");
        System.out.println();
        System.out.println("Enter pickup location");
        String pickupLocation = sc.next();
        System.out.println("Enter drop location");
        String dropLocation = sc.next();
        System.out.println("Enter pickup time");
        String pickupTime = sc.next();

        // available cabs at the time
        ArrayList<Integer> cabsIdsAvail = availableAtTheTime(pickupTime);

        if(cabsIdsAvail.size() == 0) {
            System.out.println("No cabs available at the given time");
            return;
        }
        int minStop = 0;
        Cabs nearestCab = null;
        // find the nearest cab
        for(int id: cabsIdsAvail) {
            Cabs cab = DB.cabs.get(id);
            if(Math.abs(cab.getCurrentLocation().charAt(0) - pickupLocation.charAt(0)) <= minStop) {
                minStop = Math.abs(cab.getCurrentLocation().charAt(0) - pickupLocation.charAt(0));
                nearestCab = cab;
            }
        }
        System.out.println("Amount to pay "+calculateEarning(pickupLocation,dropLocation));
        System.out.println("Enter 1 to confirm booking");
        if(sc.nextInt() != 1) {
            System.out.println("Booking cancelled");
            return;
        }
        int stoppings = Math.abs(pickupLocation.charAt(0) - dropLocation.charAt(0));
        nearestCab.setCurrentLocation(dropLocation);
        nearestCab.setEarning(calculateEarning(pickupLocation,dropLocation) + nearestCab.getEarning());
        nearestCab.setFreeTime(pickupTime.charAt(0)-'0'+stoppings+":00");

        System.out.println("Booking confirmed");
        for(Cabs cab: DB.cabs.values()) {
            System.out.println(cab.getCurrentLocation()+" "+cab.getEarning()+" "+cab.getFreeTime());
        }
    }
    static double calculateEarning(String pickupLocation,String dropLocation) {
        int stoppings = Math.abs(pickupLocation.charAt(0) - dropLocation.charAt(0));
        if(stoppings == 1) 
            return 200;
        return 200+(stoppings-1)*15*10;
    }
    // return ids of cabs that are available at the given time
    static ArrayList<Integer> availableAtTheTime(String time) {
        HashMap<Integer, Cabs> cabsMap = DB.cabs;
        ArrayList<Integer> ids =  new ArrayList<Integer>();
        int i;
        for( i = 0; i < cabsMap.size(); i++) {
            Cabs cab = cabsMap.get(i);
            if(cab.getFreeTime().equals(time)) 
                ids.add(i);
        }
        return ids;
    }
}
