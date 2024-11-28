package PainterNesamani;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class CustomerOps {
    static Scanner sc = new Scanner(System.in);

    public void customerMenu() {
        int op = -1;
        while (op != 0) {
            System.out.println("Enter 1 to List all Painters Available now ");
            System.out.println("Enter 2 to view all Painter registered here ");
            System.out.println("Enter 3 to apply filters ");
            System.out.println("Enter 0 to go back ");
            op = sc.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    printPainters(true);
                    break;
                case 2:
                    printPainters(false);
                    break;
                case 3:
                    filters();
                    break;

            }
        }
    }

    void filters() {
        System.out.println("\n \nEnter 1 to Filter based on your availablity ");
        System.out.println("Enter 2 to Filter based on your Budget ");
        System.out.println("Enter 3 to clear all filters ");
        System.out.println("Enter 0 to go back ");

        int op = sc.nextInt();
        switch (op) {
            case 0:
                break;
            case 1:
                Painters p = new Painters();
                System.out.println(
                        "Enter Your required starting time --> 'Kindly enter in this format - DD-MM-YYYY HH:MM' ");
                String reqStartDate = sc.nextLine();
                System.out.println("Enter your estimated working hours ");
                int wrkHrs = sc.nextInt();
                Date startDate = p.formatDate(reqStartDate);
                Instant instant = startDate.toInstant();
                ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault()).plusHours(wrkHrs);
                Date endDate = Date.from(zonedDateTime.toInstant());

                applyFilter(startDate, endDate, -1);
                break;
            case 2:
                System.out.println("Enter your highest Budget Amount in number only");
                Double budget = sc.nextDouble();
                applyFilter(null, null, budget);
                break;
            case 3:
                DB.dateFilter[0] = null;
                DB.dateFilter[1] = null;
                DB.costFilter = -1;
                System.out.println("\n All Filters Cleared Successfully\n");
                break;

            default:
                break;
        }
    }

    void applyFilter(Date starDate, Date endDate, double cost) {
        if (starDate == null) {
            starDate = DB.dateFilter[0];
            endDate = DB.dateFilter[1];
        }
        if (cost == -1)
            cost = DB.costFilter;

        Set<String> keys = DB.painter.keySet();
        Painters p;
        boolean noneAvail = true;

        for (String key : keys) {
            p = DB.painter.get(key);
            boolean availableUnderDate = starDate != null && endDate != null
                    && checkAvailablity(starDate, endDate, true);
            boolean availableUnderCost = cost != -1 && cost <= p.getCost();
            if (!availableUnderDate && !availableUnderCost)
                continue;
            System.out.println(
                    "Name --> " + p.getName()
                            + ", Cost --> " + p.getCost() + "Rs"
                            + ", Mobile --> " + p.getMobile()
                            + ", Available beetween --> " + p.getfreeStartTime() + " - " + p.getfreeEndTime()
                            + "\n");
            noneAvail = false;
        }

        if (noneAvail)
            System.out.println("No Painters are available under your Budget/Availability right now ");
        System.out.println("\n");
    }

    void printPainters(boolean needOlyAvail) {
        Set<String> keys = DB.painter.keySet();
        Painters p;
        boolean noneAvail = true;
        for (String key : keys) {
            p = DB.painter.get(key);
            if (!checkAvailablity(p.getfreeStartTime(), p.getfreeEndTime(), needOlyAvail))
                continue;
            System.out.println(
                    "Name --> " + p.getName()
                            + ", Cost --> " + p.getCost() + "Rs"
                            + ", Mobile --> " + p.getMobile()
                            + ", Available beetween --> " + p.getfreeStartTime() + " - " + p.getfreeEndTime()
                            + "\n");
            noneAvail = false;
        }
        if (noneAvail)
            System.out.println("No Painters are available right now ");
        System.out.println("\n");
    }

    boolean checkAvailablity(Date startTime, Date endTime, boolean needOlyAvail) {
        if (!needOlyAvail)
            return true;
        Date now = new Date();
        if (now.after(startTime) && now.before(endTime))
            return true;
        return false;
    }
}
