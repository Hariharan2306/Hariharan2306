package JAVA.IdeaProjects.Taxi.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        autoGenerateCabs();
        menu();
//        System.out.println(Cabs.cabs.get(1).getCabId()+" "+
//                Cabs.cabs.get(1).getCabRegNo()+" "+Cabs.cabs.get(1).getEarned());
    }
    static void autoGenerateCabs(){  // 4 times
        int i;
        Cabs c;
        String cabRegNo;
        for(i=1;i<=4;i++){
            cabRegNo="TN"+Math.random()*i;
            c=new Cabs(i,cabRegNo,0,'A',0);
            Cabs.cabs.add(c);
        }
    }
    static void menu(){
        System.out.println("--------Welcome--------\n");
        Scanner sc=new Scanner(System.in);
        int op1;
        Operations o=new Operations();

        do{
            System.out.println("Enter 1 for new booking \n" +
                    "Enter 2 to view booking Details \n" +
                    "Enter 3 to view cab details \n" +
                    "Enter 4 to exit");
            op1=sc.nextInt();
            switch (op1){
                case 1:
                    o.booking();
                    break;
                case 2:
                    o.viewBookingDetails();
                    break;
                case 3:
                    o.viewCabDetails();
                    break;
                default:
                    System.out.println("Enter valid input");
            }
            System.out.println("Thank you");
        }while(op1 != 4);
    }
}
//    Call Taxi Bookings Application program - zoho interview question
//        Design a Call taxi booking application
//        -There are n number of taxi’s. For simplicity, assume 4. But it should work for any number of taxi’s.
//        -The are 6 points(A,B,C,D,E,F)
//        -All the points are in a straight line, and each point is 15kms away from the adjacent points.
//        -It takes 60 mins to travel from one point to another
//        -Each taxi charges Rs.100 minimum for the first 5 kilometers and Rs.10 for the subsequent kilometers.
//        -For simplicity, time can be entered as absolute time. Eg: 9hrs, 15hrs etc.
//        -All taxi’s are initially stationed at A.
//        -When a customer books a Taxi, a free taxi at that point is allocated
//        -If no free taxi is available at that point, a free taxi at the nearest point is allocated.
//        -If two taxi’s are free at the same point, one with lower earning is allocated
//        -Note that the taxi only charges the customer from the pickup point to the drop point. Not the distance it travels from an adjacent point to pickup the customer.
//        -If no taxi is free at that time, booking is rejected
