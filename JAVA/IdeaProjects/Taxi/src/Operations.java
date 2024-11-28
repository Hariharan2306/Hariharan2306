package JAVA.IdeaProjects.Taxi.src;

import java.util.Scanner;
public class Operations {
    public void booking(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter customer ID ");
        int customerId= sc.nextInt();
        System.out.println("Enter Pickup point (A-F)");
        char pickupPoint=sc.next().charAt(0);
        System.out.println("Enter Drop Point (A-F) ");
        char dropPoint=sc.next().charAt(0);
        System.out.println("Enter pickup time ");
        int pickupTime= sc.nextInt();

        int i,min=Math.abs('F'-'A');                 //assuming first cab is closest
        Cabs c,eligible=Cabs.cabs.get(0);
        boolean anythingAvailable=false;

        for(i=0;i<Cabs.cabs.size();i++){       //calculations
            c=Cabs.cabs.get(i);

            int diff=Math.abs(c.getCurrentLocation()-pickupPoint);
            boolean available=available(pickupTime,c);

            if( diff<min && available){
                anythingAvailable=true;
                eligible=c;
                min=diff;
            }
            if(diff == min && available){
                anythingAvailable=true;
                if(c.getEarned() < eligible.getEarned())
                    eligible=c;
            }
        }
        if(! anythingAvailable) {
            System.out.println("No Cabs Available currently ");
            return;
        }
        int freeTime=pickupTime+Math.abs(pickupPoint-dropPoint);
        long currentEarned= eligible.getEarned();
        long amountPaid=earned(pickupPoint,dropPoint);
        long totEarned=currentEarned+amountPaid;

        eligible.setFreeTime(freeTime);     // cabs class over
        eligible.setCurrentLocation(dropPoint);
        eligible.setEarned(totEarned);

        int bookingId =bookingId();  //traverse and find last booking ID from map morning

        Bookings booking = new Bookings(bookingId,customerId,pickupTime,freeTime,eligible.getCabId(),
                eligible.getCabRegNo(),pickupPoint,dropPoint,amountPaid);  //set this obj in map

        Bookings.bookingsList.add(booking);  //inserting into List

        System.out.println("Bookings Successful\n" +
                "Your Booking ID is  "+ bookingId +"\n" +
                "Your Cab REG No is  "+eligible.getCabRegNo()+"\n" +
                "Amount You've to pay  "+amountPaid+"\n");
    }
    private boolean available(int pickupTime,Cabs c){
        return pickupTime==0 || c.getFreeTime() <= pickupTime;
    }
    private int earned(char pickUpPoint,char dropPoint){
        if(Math.abs(pickUpPoint-dropPoint)*15 <= 5)
            return 100;
        else
            return (Math.abs((pickUpPoint-dropPoint)*15)*10)+100;
    }
    private int bookingId(){
        if(Bookings.bookingsList.isEmpty())        //if empty booking id is 1
            return 1;
        else {
            int lastBookingId=Bookings.bookingsList.size() - 1;
            return ++lastBookingId;
        }
    }
    public void viewBookingDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Booking ID");
        int bId=sc.nextInt();

        System.out.println("---------------Booking Details---------------");
        Bookings b=Bookings.bookingsList.get(bId-1);
        System.out.println("Customer ID -- "+b.getCustomerId()+"\n");
        System.out.println("Customer Pickup point -- "+b.getPickupPoint()+"\n");
        System.out.println("Customer Drop Point -- "+b.getDropPoint()+"\n");
        System.out.println("Customer Pickup time -- "+b.getPickupTime()+"\n");
        System.out.println("Customer Drop point -- "+b.getDropTime()+"\n");
        System.out.println("CAB ID -- "+b.getCabId()+"\n");
        System.out.println("CAB Register No -- "+b.getCabRegNo()+"\n");
        System.out.println("Amount Paid -- "+b.getAmount()+"\n");
    }
    public void viewCabDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter CAB Register Number -- ");
        String tempCabReg=sc.next();

        int i,tempCabId=-1;
        for(i=0;i<Cabs.cabs.size();i++){
            Cabs c=Cabs.cabs.get(i);
            if(c.getCabRegNo().equals(tempCabReg))
                tempCabId=i;
        }
        if(tempCabId==-1){
            System.out.println("No such cab Present --- Try Again ");
            return;
        }
        System.out.println("---------------TAXI Details---------------");
        Cabs c=Cabs.cabs.get(tempCabId);
        System.out.println("CAB ID -- "+c.getCabId()+"\n");
        System.out.println("CAB Register Number -- "+c.getCabRegNo()+"\n");
        System.out.println("CAB Next Location -- "+c.getCurrentLocation()+"\n");
        System.out.println("CAB Available Time -- "+c.getFreeTime());
    }
}